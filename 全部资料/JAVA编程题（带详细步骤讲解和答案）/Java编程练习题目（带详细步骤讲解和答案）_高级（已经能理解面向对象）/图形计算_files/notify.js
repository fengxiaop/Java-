var mNotify ={

    "dialog": function(type, text) {
        noty({
            text: text,
            type: type,
            dismissQueue: true,
            layout: 'center',
            closeWith: ['button'],
            theme: 'relax',
            maxVisible: 10,
            modal: true,
            force: true,
            animation: {
                open: "animated bounceInDown",
                close: "animated bounceOutDown",
                easing: 'swing',
                speed: 500
            }
        });
    },
    "confirm":function(type,text,okText,cancelText,okFun,cancelFun) {
        noty({
            text        : text,
            type        : type,
            dismissQueue: true,
            layout      : 'center',
            theme       : 'relax',
            modal       : true,
            buttons     : [
                {
                    addClass: 'nty_confirm_button', text: okText,
                        onClick: function ($noty) {
                            $noty.close();
                            if(typeof okFun == 'function')
                                okFun();
                        }
                },
                {
                    addClass: 'nty_reset_button', text: cancelText,
                        onClick: function ($noty) {
                            $noty.close();

                            if(typeof cancelFun == 'function')
                                cancelFun();
                        }
                }
            ]
        });

    },
    "toast":function(type, text) {
        noty({
            text        : text,
            type        : type,
            dismissQueue: true,
            layout      : 'center',
            closeWith   : ['backdrop'],
            theme       : 'relax',
            maxVisible  : 10,
            timeout     : 1000,
			modal       : true,
            animation   : {
                open  : {height: 'toggle'},
                close : {height: 'toggle'},
                easing: 'swing',
                speed : 500
            }
        });
    }
}