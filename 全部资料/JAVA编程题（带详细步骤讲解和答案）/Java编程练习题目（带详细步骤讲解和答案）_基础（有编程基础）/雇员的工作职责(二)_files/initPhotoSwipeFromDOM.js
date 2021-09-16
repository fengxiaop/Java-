var body_wid = document.documentElement.clientWidth;//获取屏幕宽度
if(body_wid < 1024) {
	var initPhotoSwipeFromDOM = function(gallerySelector) {

		var parseThumbnailElements = function(el) {
		    var thumbElements = el.childNodes,
		        numNodes = thumbElements.length,
		        items = [],
		        el,
		        childElements,
		        thumbnailEl,
		        size,
		        item;

		    for(var i = 0; i < numNodes; i++) {
		        el = thumbElements[i];

		        // include only element nodes 
		        if(el.nodeType !== 1) {
		          continue;
		        }

		        childElements = el.children;

		        size = el.getAttribute('data-size').split('x');

		        // create slide object
		        item = {
					src: el.getAttribute('href'),
					w: parseInt(size[0], 10),
					h: parseInt(size[1], 10),
					author: el.getAttribute('data-author')
		        };

		        item.el = el; // save link to element for getThumbBoundsFn

		        if(childElements.length > 0) {
		          item.msrc = childElements[0].getAttribute('src'); // thumbnail url
		          if(childElements.length > 1) {
		              item.title = childElements[1].innerHTML; // caption (contents of figure)
		          }
		        }


				var mediumSrc = el.getAttribute('data-med');
	          	if(mediumSrc) {
	            	size = el.getAttribute('data-med-size').split('x');
	            	// "medium-sized" image
	            	item.m = {
	              		src: mediumSrc,
	              		w: parseInt(size[0], 10),
	              		h: parseInt(size[1], 10)
	            	};
	          	}
	          	// original image
	          	item.o = {
	          		src: item.src,
	          		w: item.w,
	          		h: item.h
	          	};

		        items.push(item);
		    }

		    return items;
		};

		// find nearest parent element
		var closest = function closest(el, fn) {
		    return el && ( fn(el) ? el : closest(el.parentNode, fn) );
		};

		var onThumbnailsClick = function(e) {
		    e = e || window.event;
		    e.preventDefault ? e.preventDefault() : e.returnValue = false;

		    var eTarget = e.target || e.srcElement;

		    var clickedListItem = closest(eTarget, function(el) {
		        return el.tagName === 'A';
		    });

		    if(!clickedListItem) {
		        return;
		    }

		    var clickedGallery = clickedListItem.parentNode;

		    var childNodes = clickedListItem.parentNode.childNodes,
		        numChildNodes = childNodes.length,
		        nodeIndex = 0,
		        index;

		    for (var i = 0; i < numChildNodes; i++) {
		        if(childNodes[i].nodeType !== 1) { 
		            continue; 
		        }

		        if(childNodes[i] === clickedListItem) {
		            index = nodeIndex;
		            break;
		        }
		        nodeIndex++;
		    }

		    if(index >= 0) {
		        openPhotoSwipe( index, clickedGallery );
		    }
		    return false;
		};

		var photoswipeParseHash = function() {
			var hash = window.location.hash.substring(1),
		    params = {};

		    if(hash.length < 5) { // pid=1
		        return params;
		    }

		    var vars = hash.split('&');
		    for (var i = 0; i < vars.length; i++) {
		        if(!vars[i]) {
		            continue;
		        }
		        var pair = vars[i].split('=');  
		        if(pair.length < 2) {
		            continue;
		        }           
		        params[pair[0]] = pair[1];
		    }

		    if(params.gid) {
		    	params.gid = parseInt(params.gid, 10);
		    }

		    if(!params.hasOwnProperty('pid')) {
		        return params;
		    }
		    params.pid = parseInt(params.pid, 10);
		    return params;
		};

		var openPhotoSwipe = function(index, galleryElement, disableAnimation) {
		    var pswpElement = document.querySelectorAll('.pswp')[0],
		        gallery,
		        options,
		        items;

			items = parseThumbnailElements(galleryElement);

		    // define options (if needed)
		    options = {
		        index: index,

		        galleryUID: galleryElement.getAttribute('data-pswp-uid'),

		        tapToClose: true,			//鐐瑰嚮鍥剧墖鍏抽棴娴忚

		        tapToToggleControls: false, //鐐瑰嚮鏄剧ず/闅愯棌鎺у埗妗�

				closeEl:false,				//鍏抽棴鎸夐挳
				captionEl: false,			//鍥剧墖搴曢儴鐨勭畝浠�
				fullscreenEl: false,		//鍏ㄥ睆鎸夐挳
				zoomEl: false,				//缂╂斁鎸夐挳
				shareEl: false,				//鍒嗕韩鎸夐挳
				counterEl: false,			//鏄剧ず鐩墠鐓х墖鏁扮洰
				arrowEl: true,				//鏄剧ず涓嬩竴寮犱笂涓�紶绠ご
				preloaderEl: true,			//棰勫姞杞藉浘鏍�

				shareButtons: [
					{id:'facebook', label:'Share on Facebook', url:'https://www.facebook.com/sharer/sharer.php?u={{url}}'},
					{id:'twitter', label:'Tweet', url:'https://twitter.com/intent/tweet?text={{text}}&url={{url}}'},
					{id:'pinterest', label:'Pin it', url:'http://www.pinterest.com/pin/create/button/?url={{url}}&media={{image_url}}&description={{text}}'},
					{id:'download', label:'Download image', url:'{{raw_image_url}}', download:true}
				],

		        getThumbBoundsFn: function(index) {
		            // See Options->getThumbBoundsFn section of docs for more info
		            var thumbnail = items[index].el.children[0],
		                pageYScroll = window.pageYOffset || document.documentElement.scrollTop,
		                rect = thumbnail.getBoundingClientRect(); 

		            return {x:rect.left, y:rect.top + pageYScroll, w:rect.width};
		        },

		        addCaptionHTMLFn: function(item, captionEl, isFake) {
					if(!item.title) {
						captionEl.children[0].innerText = '';
						return false;
					}
					captionEl.children[0].innerHTML = item.title +  '<br/><small>Photo: ' + item.author + '</small>';
					return true;
		        }
				
		    };

			var radios = document.getElementsByName('gallery-style');
			for (var i = 0, length = radios.length; i < length; i++) {
			    if (radios[i].checked) {
			        if(radios[i].id == 'radio-all-controls') {

			        } else if(radios[i].id == 'radio-minimal-black') {
			        	options.mainClass = 'pswp--minimal--dark';
				        options.barsSize = {top:0,bottom:0};
						options.captionEl = false;
						options.fullscreenEl = false;
						options.shareEl = false;
						options.bgOpacity = 0.85;
						options.tapToClose = true;
						options.tapToToggleControls = false;
			        }
			        break;
			    }
			}

		    if(disableAnimation) {
		        options.showAnimationDuration = 0;
		    }

		    // Pass data to PhotoSwipe and initialize it
		    gallery = new PhotoSwipe( pswpElement, PhotoSwipeUI_Default, items, options);

		    // see: http://photoswipe.com/documentation/responsive-images.html
			var realViewportWidth,
			    useLargeImages = false,
			    firstResize = true,
			    imageSrcWillChange;

			gallery.listen('beforeResize', function() {

				var dpiRatio = window.devicePixelRatio ? window.devicePixelRatio : 1;
				dpiRatio = Math.min(dpiRatio, 2.5);
			    realViewportWidth = gallery.viewportSize.x * dpiRatio;


			    if(realViewportWidth >= 1200 || (!gallery.likelyTouchDevice && realViewportWidth > 800) || screen.width > 1200 ) {
			    	if(!useLargeImages) {
			    		useLargeImages = true;
			        	imageSrcWillChange = true;
			    	}
			        
			    } else {
			    	if(useLargeImages) {
			    		useLargeImages = false;
			        	imageSrcWillChange = true;
			    	}
			    }

			    if(imageSrcWillChange && !firstResize) {
			        gallery.invalidateCurrItems();
			    }

			    if(firstResize) {
			        firstResize = false;
			    }

			    imageSrcWillChange = false;

			});

			gallery.listen('gettingData', function(index, item) {
			    if( useLargeImages ) {
			        item.src = item.o.src;
			        item.w = item.o.w;
			        item.h = item.o.h;
			    } else {
			        item.src = item.m.src;
			        item.w = item.m.w;
			        item.h = item.m.h;
			    }
			});

		    gallery.init();
		};

		// select all gallery elements
		var galleryElements = document.querySelectorAll( gallerySelector );
		for(var i = 0, l = galleryElements.length; i < l; i++) {
			galleryElements[i].setAttribute('data-pswp-uid', i+1);
			galleryElements[i].onclick = onThumbnailsClick;
		}

		// Parse URL and open gallery if it contains #&pid=3&gid=1
		var hashData = photoswipeParseHash();
		if(hashData.pid > 0 && hashData.gid > 0) {
			openPhotoSwipe( hashData.pid - 1 ,  galleryElements[ hashData.gid - 1 ], true );
		}
	};
}
else {
	$('.gallery').find('a').attr('href','javascript:void(0)');
}
