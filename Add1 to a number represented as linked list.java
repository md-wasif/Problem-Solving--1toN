<!DOCTYPE html>
<!-- saved from url=(0091)https://practice.geeksforgeeks.org/problems/add-1-to-a-number-represented-as-linked-list/1# -->
<html lang="en"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8"><style id="ace-dracula">.ace-dracula .ace_gutter {background: #282a36;color: rgb(144,145,148)}.ace-dracula .ace_print-margin {width: 1px;background: #44475a}.ace-dracula {background-color: #282a36;color: #f8f8f2}.ace-dracula .ace_cursor {color: #f8f8f0}.ace-dracula .ace_marker-layer .ace_selection {background: #44475a}.ace-dracula.ace_multiselect .ace_selection.ace_start {box-shadow: 0 0 3px 0px #282a36;border-radius: 2px}.ace-dracula .ace_marker-layer .ace_step {background: rgb(198, 219, 174)}.ace-dracula .ace_marker-layer .ace_bracket {margin: -1px 0 0 -1px;border: 1px solid #a29709}.ace-dracula .ace_marker-layer .ace_active-line {background: #44475a}.ace-dracula .ace_gutter-active-line {background-color: #44475a}.ace-dracula .ace_marker-layer .ace_selected-word {box-shadow: 0px 0px 0px 1px #a29709;border-radius: 3px;}.ace-dracula .ace_fold {background-color: #50fa7b;border-color: #f8f8f2}.ace-dracula .ace_keyword {color: #ff79c6}.ace-dracula .ace_constant.ace_language {color: #bd93f9}.ace-dracula .ace_constant.ace_numeric {color: #bd93f9}.ace-dracula .ace_constant.ace_character {color: #bd93f9}.ace-dracula .ace_constant.ace_character.ace_escape {color: #ff79c6}.ace-dracula .ace_constant.ace_other {color: #bd93f9}.ace-dracula .ace_support.ace_function {color: #8be9fd}.ace-dracula .ace_support.ace_constant {color: #6be5fd}.ace-dracula .ace_support.ace_class {font-style: italic;color: #66d9ef}.ace-dracula .ace_support.ace_type {font-style: italic;color: #66d9ef}.ace-dracula .ace_storage {color: #ff79c6}.ace-dracula .ace_storage.ace_type {font-style: italic;color: #8be9fd}.ace-dracula .ace_invalid {color: #F8F8F0;background-color: #ff79c6}.ace-dracula .ace_invalid.ace_deprecated {color: #F8F8F0;background-color: #bd93f9}.ace-dracula .ace_string {color: #f1fa8c}.ace-dracula .ace_comment {color: #6272a4}.ace-dracula .ace_variable {color: #50fa7b}.ace-dracula .ace_variable.ace_parameter {font-style: italic;color: #ffb86c}.ace-dracula .ace_entity.ace_other.ace_attribute-name {color: #50fa7b}.ace-dracula .ace_entity.ace_name.ace_function {color: #50fa7b}.ace-dracula .ace_entity.ace_name.ace_tag {color: #ff79c6}.ace-dracula .ace_invisible {color: #626680;}.ace-dracula .ace_indent-guide {background: url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAACCAYAAACZgbYnAAAAEklEQVQImWNgYGBgYHB3d/8PAAOIAdULw8qMAAAAAElFTkSuQmCC) right repeat-y}
/*# sourceURL=ace/css/ace-dracula */</style><style class="vjs-styles-defaults">
      .video-js {
        width: 300px;
        height: 150px;
      }

      .vjs-fluid {
        padding-top: 56.25%
      }
    </style><style id="autocompletion.css">.ace_editor.ace_autocomplete .ace_marker-layer .ace_active-line {    background-color: #CAD6FA;    z-index: 1;}.ace_dark.ace_editor.ace_autocomplete .ace_marker-layer .ace_active-line {    background-color: #3a674e;}.ace_editor.ace_autocomplete .ace_line-hover {    border: 1px solid #abbffe;    margin-top: -1px;    background: rgba(233,233,253,0.4);    position: absolute;    z-index: 2;}.ace_dark.ace_editor.ace_autocomplete .ace_line-hover {    border: 1px solid rgba(109, 150, 13, 0.8);    background: rgba(58, 103, 78, 0.62);}.ace_completion-meta {    opacity: 0.5;    margin: 0.9em;}.ace_editor.ace_autocomplete .ace_completion-highlight{    color: #2d69c7;}.ace_dark.ace_editor.ace_autocomplete .ace_completion-highlight{    color: #93ca12;}.ace_editor.ace_autocomplete {    width: 300px;    z-index: 200000;    border: 1px lightgray solid;    position: fixed;    box-shadow: 2px 3px 5px rgba(0,0,0,.2);    line-height: 1.4;    background: #fefefe;    color: #111;}.ace_dark.ace_editor.ace_autocomplete {    border: 1px #484747 solid;    box-shadow: 2px 3px 5px rgba(0, 0, 0, 0.51);    line-height: 1.4;    background: #25282c;    color: #c1c1c1;}
/*# sourceURL=ace/css/autocompletion.css */</style><style>.ace_snippet-marker {    -moz-box-sizing: border-box;    box-sizing: border-box;    background: rgba(194, 193, 208, 0.09);    border: 1px dotted rgba(211, 208, 235, 0.62);    position: absolute;}</style><style>    .error_widget_wrapper {        background: inherit;        color: inherit;        border:none    }    .error_widget {        border-top: solid 2px;        border-bottom: solid 2px;        margin: 5px 0;        padding: 10px 40px;        white-space: pre-wrap;    }    .error_widget.ace_error, .error_widget_arrow.ace_error{        border-color: #ff5a5a    }    .error_widget.ace_warning, .error_widget_arrow.ace_warning{        border-color: #F1D817    }    .error_widget.ace_info, .error_widget_arrow.ace_info{        border-color: #5a5a5a    }    .error_widget.ace_ok, .error_widget_arrow.ace_ok{        border-color: #5aaa5a    }    .error_widget_arrow {        position: absolute;        border: solid 5px;        border-top-color: transparent!important;        border-right-color: transparent!important;        border-left-color: transparent!important;        top: -5px;    }</style><style id="ace-tm">.ace-tm .ace_gutter {background: #f0f0f0;color: #333;}.ace-tm .ace_print-margin {width: 1px;background: #e8e8e8;}.ace-tm .ace_fold {background-color: #6B72E6;}.ace-tm {background-color: #FFFFFF;color: black;}.ace-tm .ace_cursor {color: black;}.ace-tm .ace_invisible {color: rgb(191, 191, 191);}.ace-tm .ace_storage,.ace-tm .ace_keyword {color: blue;}.ace-tm .ace_constant {color: rgb(197, 6, 11);}.ace-tm .ace_constant.ace_buildin {color: rgb(88, 72, 246);}.ace-tm .ace_constant.ace_language {color: rgb(88, 92, 246);}.ace-tm .ace_constant.ace_library {color: rgb(6, 150, 14);}.ace-tm .ace_invalid {background-color: rgba(255, 0, 0, 0.1);color: red;}.ace-tm .ace_support.ace_function {color: rgb(60, 76, 114);}.ace-tm .ace_support.ace_constant {color: rgb(6, 150, 14);}.ace-tm .ace_support.ace_type,.ace-tm .ace_support.ace_class {color: rgb(109, 121, 222);}.ace-tm .ace_keyword.ace_operator {color: rgb(104, 118, 135);}.ace-tm .ace_string {color: rgb(3, 106, 7);}.ace-tm .ace_comment {color: rgb(76, 136, 107);}.ace-tm .ace_comment.ace_doc {color: rgb(0, 102, 255);}.ace-tm .ace_comment.ace_doc.ace_tag {color: rgb(128, 159, 191);}.ace-tm .ace_constant.ace_numeric {color: rgb(0, 0, 205);}.ace-tm .ace_variable {color: rgb(49, 132, 149);}.ace-tm .ace_xml-pe {color: rgb(104, 104, 91);}.ace-tm .ace_entity.ace_name.ace_function {color: #0000A2;}.ace-tm .ace_heading {color: rgb(12, 7, 255);}.ace-tm .ace_list {color:rgb(185, 6, 144);}.ace-tm .ace_meta.ace_tag {color:rgb(0, 22, 142);}.ace-tm .ace_string.ace_regex {color: rgb(255, 0, 0)}.ace-tm .ace_marker-layer .ace_selection {background: rgb(181, 213, 255);}.ace-tm.ace_multiselect .ace_selection.ace_start {box-shadow: 0 0 3px 0px white;}.ace-tm .ace_marker-layer .ace_step {background: rgb(252, 255, 0);}.ace-tm .ace_marker-layer .ace_stack {background: rgb(164, 229, 101);}.ace-tm .ace_marker-layer .ace_bracket {margin: -1px 0 0 -1px;border: 1px solid rgb(192, 192, 192);}.ace-tm .ace_marker-layer .ace_active-line {background: rgba(0, 0, 0, 0.07);}.ace-tm .ace_gutter-active-line {background-color : #dcdcdc;}.ace-tm .ace_marker-layer .ace_selected-word {background: rgb(250, 250, 255);border: 1px solid rgb(200, 200, 250);}.ace-tm .ace_indent-guide {background: url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAACCAYAAACZgbYnAAAAE0lEQVQImWP4////f4bLly//BwAmVgd1/w11/gAAAABJRU5ErkJggg==") right repeat-y;}
/*# sourceURL=ace/css/ace-tm */</style><style id="ace_editor.css">.ace_br1 {border-top-left-radius    : 3px;}.ace_br2 {border-top-right-radius   : 3px;}.ace_br3 {border-top-left-radius    : 3px; border-top-right-radius:    3px;}.ace_br4 {border-bottom-right-radius: 3px;}.ace_br5 {border-top-left-radius    : 3px; border-bottom-right-radius: 3px;}.ace_br6 {border-top-right-radius   : 3px; border-bottom-right-radius: 3px;}.ace_br7 {border-top-left-radius    : 3px; border-top-right-radius:    3px; border-bottom-right-radius: 3px;}.ace_br8 {border-bottom-left-radius : 3px;}.ace_br9 {border-top-left-radius    : 3px; border-bottom-left-radius:  3px;}.ace_br10{border-top-right-radius   : 3px; border-bottom-left-radius:  3px;}.ace_br11{border-top-left-radius    : 3px; border-top-right-radius:    3px; border-bottom-left-radius:  3px;}.ace_br12{border-bottom-right-radius: 3px; border-bottom-left-radius:  3px;}.ace_br13{border-top-left-radius    : 3px; border-bottom-right-radius: 3px; border-bottom-left-radius:  3px;}.ace_br14{border-top-right-radius   : 3px; border-bottom-right-radius: 3px; border-bottom-left-radius:  3px;}.ace_br15{border-top-left-radius    : 3px; border-top-right-radius:    3px; border-bottom-right-radius: 3px; border-bottom-left-radius: 3px;}.ace_editor {position: relative;overflow: hidden;font: 12px/normal 'Monaco', 'Menlo', 'Ubuntu Mono', 'Consolas', 'source-code-pro', monospace;direction: ltr;text-align: left;-webkit-tap-highlight-color: rgba(0, 0, 0, 0);}.ace_scroller {position: absolute;overflow: hidden;top: 0;bottom: 0;background-color: inherit;-ms-user-select: none;-moz-user-select: none;-webkit-user-select: none;user-select: none;cursor: text;}.ace_content {position: absolute;box-sizing: border-box;min-width: 100%;contain: style size layout;}.ace_dragging .ace_scroller:before{position: absolute;top: 0;left: 0;right: 0;bottom: 0;content: '';background: rgba(250, 250, 250, 0.01);z-index: 1000;}.ace_dragging.ace_dark .ace_scroller:before{background: rgba(0, 0, 0, 0.01);}.ace_selecting, .ace_selecting * {cursor: text !important;}.ace_gutter {position: absolute;overflow : hidden;width: auto;top: 0;bottom: 0;left: 0;cursor: default;z-index: 4;-ms-user-select: none;-moz-user-select: none;-webkit-user-select: none;user-select: none;contain: style size layout;}.ace_gutter-active-line {position: absolute;left: 0;right: 0;}.ace_scroller.ace_scroll-left {box-shadow: 17px 0 16px -16px rgba(0, 0, 0, 0.4) inset;}.ace_gutter-cell {position: absolute;top: 0;left: 0;right: 0;padding-left: 19px;padding-right: 6px;background-repeat: no-repeat;}.ace_gutter-cell.ace_error {background-image: url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAMAAAAoLQ9TAAABOFBMVEX/////////QRswFAb/Ui4wFAYwFAYwFAaWGAfDRymzOSH/PxswFAb/SiUwFAYwFAbUPRvjQiDllog5HhHdRybsTi3/Tyv9Tir+Syj/UC3////XurebMBIwFAb/RSHbPx/gUzfdwL3kzMivKBAwFAbbvbnhPx66NhowFAYwFAaZJg8wFAaxKBDZurf/RB6mMxb/SCMwFAYwFAbxQB3+RB4wFAb/Qhy4Oh+4QifbNRcwFAYwFAYwFAb/QRzdNhgwFAYwFAbav7v/Uy7oaE68MBK5LxLewr/r2NXewLswFAaxJw4wFAbkPRy2PyYwFAaxKhLm1tMwFAazPiQwFAaUGAb/QBrfOx3bvrv/VC/maE4wFAbRPBq6MRO8Qynew8Dp2tjfwb0wFAbx6eju5+by6uns4uH9/f36+vr/GkHjAAAAYnRSTlMAGt+64rnWu/bo8eAA4InH3+DwoN7j4eLi4xP99Nfg4+b+/u9B/eDs1MD1mO7+4PHg2MXa347g7vDizMLN4eG+Pv7i5evs/v79yu7S3/DV7/498Yv24eH+4ufQ3Ozu/v7+y13sRqwAAADLSURBVHjaZc/XDsFgGIBhtDrshlitmk2IrbHFqL2pvXf/+78DPokj7+Fz9qpU/9UXJIlhmPaTaQ6QPaz0mm+5gwkgovcV6GZzd5JtCQwgsxoHOvJO15kleRLAnMgHFIESUEPmawB9ngmelTtipwwfASilxOLyiV5UVUyVAfbG0cCPHig+GBkzAENHS0AstVF6bacZIOzgLmxsHbt2OecNgJC83JERmePUYq8ARGkJx6XtFsdddBQgZE2nPR6CICZhawjA4Fb/chv+399kfR+MMMDGOQAAAABJRU5ErkJggg==");background-repeat: no-repeat;background-position: 2px center;}.ace_gutter-cell.ace_warning {background-image: url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAMAAAAoLQ9TAAAAmVBMVEX///8AAAD///8AAAAAAABPSzb/5sAAAAB/blH/73z/ulkAAAAAAAD85pkAAAAAAAACAgP/vGz/rkDerGbGrV7/pkQICAf////e0IsAAAD/oED/qTvhrnUAAAD/yHD/njcAAADuv2r/nz//oTj/p064oGf/zHAAAAA9Nir/tFIAAAD/tlTiuWf/tkIAAACynXEAAAAAAAAtIRW7zBpBAAAAM3RSTlMAABR1m7RXO8Ln31Z36zT+neXe5OzooRDfn+TZ4p3h2hTf4t3k3ucyrN1K5+Xaks52Sfs9CXgrAAAAjklEQVR42o3PbQ+CIBQFYEwboPhSYgoYunIqqLn6/z8uYdH8Vmdnu9vz4WwXgN/xTPRD2+sgOcZjsge/whXZgUaYYvT8QnuJaUrjrHUQreGczuEafQCO/SJTufTbroWsPgsllVhq3wJEk2jUSzX3CUEDJC84707djRc5MTAQxoLgupWRwW6UB5fS++NV8AbOZgnsC7BpEAAAAABJRU5ErkJggg==");background-position: 2px center;}.ace_gutter-cell.ace_info {background-image: url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAAAAAA6mKC9AAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAAJ0Uk5TAAB2k804AAAAPklEQVQY02NgIB68QuO3tiLznjAwpKTgNyDbMegwisCHZUETUZV0ZqOquBpXj2rtnpSJT1AEnnRmL2OgGgAAIKkRQap2htgAAAAASUVORK5CYII=");background-position: 2px center;}.ace_dark .ace_gutter-cell.ace_info {background-image: url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQBAMAAADt3eJSAAAAJFBMVEUAAAChoaGAgIAqKiq+vr6tra1ZWVmUlJSbm5s8PDxubm56enrdgzg3AAAAAXRSTlMAQObYZgAAAClJREFUeNpjYMAPdsMYHegyJZFQBlsUlMFVCWUYKkAZMxZAGdxlDMQBAG+TBP4B6RyJAAAAAElFTkSuQmCC");}.ace_scrollbar {contain: strict;position: absolute;right: 0;bottom: 0;z-index: 6;}.ace_scrollbar-inner {position: absolute;cursor: text;left: 0;top: 0;}.ace_scrollbar-v{overflow-x: hidden;overflow-y: scroll;top: 0;}.ace_scrollbar-h {overflow-x: scroll;overflow-y: hidden;left: 0;}.ace_print-margin {position: absolute;height: 100%;}.ace_text-input {position: absolute;z-index: 0;width: 0.5em;height: 1em;opacity: 0;background: transparent;-moz-appearance: none;appearance: none;border: none;resize: none;outline: none;overflow: hidden;font: inherit;padding: 0 1px;margin: 0 -1px;contain: strict;-ms-user-select: text;-moz-user-select: text;-webkit-user-select: text;user-select: text;white-space: pre!important;}.ace_text-input.ace_composition {background: transparent;color: inherit;z-index: 1000;opacity: 1;}.ace_composition_placeholder { color: transparent }.ace_composition_marker { border-bottom: 1px solid;position: absolute;border-radius: 0;margin-top: 1px;}[ace_nocontext=true] {transform: none!important;filter: none!important;perspective: none!important;clip-path: none!important;mask : none!important;contain: none!important;perspective: none!important;mix-blend-mode: initial!important;z-index: auto;}.ace_layer {z-index: 1;position: absolute;overflow: hidden;word-wrap: normal;white-space: pre;height: 100%;width: 100%;box-sizing: border-box;pointer-events: none;}.ace_gutter-layer {position: relative;width: auto;text-align: right;pointer-events: auto;height: 1000000px;contain: style size layout;}.ace_text-layer {font: inherit !important;position: absolute;height: 1000000px;width: 1000000px;contain: style size layout;}.ace_text-layer > .ace_line, .ace_text-layer > .ace_line_group {contain: style size layout;position: absolute;top: 0;left: 0;right: 0;}.ace_hidpi .ace_text-layer,.ace_hidpi .ace_gutter-layer,.ace_hidpi .ace_content,.ace_hidpi .ace_gutter {contain: strict;will-change: transform;}.ace_hidpi .ace_text-layer > .ace_line, .ace_hidpi .ace_text-layer > .ace_line_group {contain: strict;}.ace_cjk {display: inline-block;text-align: center;}.ace_cursor-layer {z-index: 4;}.ace_cursor {z-index: 4;position: absolute;box-sizing: border-box;border-left: 2px solid;transform: translatez(0);}.ace_multiselect .ace_cursor {border-left-width: 1px;}.ace_slim-cursors .ace_cursor {border-left-width: 1px;}.ace_overwrite-cursors .ace_cursor {border-left-width: 0;border-bottom: 1px solid;}.ace_hidden-cursors .ace_cursor {opacity: 0.2;}.ace_smooth-blinking .ace_cursor {transition: opacity 0.18s;}.ace_animate-blinking .ace_cursor {animation-duration: 1000ms;animation-timing-function: step-end;animation-name: blink-ace-animate;animation-iteration-count: infinite;}.ace_animate-blinking.ace_smooth-blinking .ace_cursor {animation-duration: 1000ms;animation-timing-function: ease-in-out;animation-name: blink-ace-animate-smooth;}@keyframes blink-ace-animate {from, to { opacity: 1; }60% { opacity: 0; }}@keyframes blink-ace-animate-smooth {from, to { opacity: 1; }45% { opacity: 1; }60% { opacity: 0; }85% { opacity: 0; }}.ace_marker-layer .ace_step, .ace_marker-layer .ace_stack {position: absolute;z-index: 3;}.ace_marker-layer .ace_selection {position: absolute;z-index: 5;}.ace_marker-layer .ace_bracket {position: absolute;z-index: 6;}.ace_marker-layer .ace_active-line {position: absolute;z-index: 2;}.ace_marker-layer .ace_selected-word {position: absolute;z-index: 4;box-sizing: border-box;}.ace_line .ace_fold {box-sizing: border-box;display: inline-block;height: 11px;margin-top: -2px;vertical-align: middle;background-image:url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABEAAAAJCAYAAADU6McMAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAJpJREFUeNpi/P//PwOlgAXGYGRklAVSokD8GmjwY1wasKljQpYACtpCFeADcHVQfQyMQAwzwAZI3wJKvCLkfKBaMSClBlR7BOQikCFGQEErIH0VqkabiGCAqwUadAzZJRxQr/0gwiXIal8zQQPnNVTgJ1TdawL0T5gBIP1MUJNhBv2HKoQHHjqNrA4WO4zY0glyNKLT2KIfIMAAQsdgGiXvgnYAAAAASUVORK5CYII="),url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAA3CAYAAADNNiA5AAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAACJJREFUeNpi+P//fxgTAwPDBxDxD078RSX+YeEyDFMCIMAAI3INmXiwf2YAAAAASUVORK5CYII=");background-repeat: no-repeat, repeat-x;background-position: center center, top left;color: transparent;border: 1px solid black;border-radius: 2px;cursor: pointer;pointer-events: auto;}.ace_dark .ace_fold {}.ace_fold:hover{background-image:url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABEAAAAJCAYAAADU6McMAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAJpJREFUeNpi/P//PwOlgAXGYGRklAVSokD8GmjwY1wasKljQpYACtpCFeADcHVQfQyMQAwzwAZI3wJKvCLkfKBaMSClBlR7BOQikCFGQEErIH0VqkabiGCAqwUadAzZJRxQr/0gwiXIal8zQQPnNVTgJ1TdawL0T5gBIP1MUJNhBv2HKoQHHjqNrA4WO4zY0glyNKLT2KIfIMAAQsdgGiXvgnYAAAAASUVORK5CYII="),url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAA3CAYAAADNNiA5AAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAACBJREFUeNpi+P//fz4TAwPDZxDxD5X4i5fLMEwJgAADAEPVDbjNw87ZAAAAAElFTkSuQmCC");}.ace_tooltip {background-color: #FFF;background-image: linear-gradient(to bottom, transparent, rgba(0, 0, 0, 0.1));border: 1px solid gray;border-radius: 1px;box-shadow: 0 1px 2px rgba(0, 0, 0, 0.3);color: black;max-width: 100%;padding: 3px 4px;position: fixed;z-index: 999999;box-sizing: border-box;cursor: default;white-space: pre;word-wrap: break-word;line-height: normal;font-style: normal;font-weight: normal;letter-spacing: normal;pointer-events: none;}.ace_folding-enabled > .ace_gutter-cell {padding-right: 13px;}.ace_fold-widget {box-sizing: border-box;margin: 0 -12px 0 1px;display: none;width: 11px;vertical-align: top;background-image: url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAUAAAAFCAYAAACNbyblAAAANElEQVR42mWKsQ0AMAzC8ixLlrzQjzmBiEjp0A6WwBCSPgKAXoLkqSot7nN3yMwR7pZ32NzpKkVoDBUxKAAAAABJRU5ErkJggg==");background-repeat: no-repeat;background-position: center;border-radius: 3px;border: 1px solid transparent;cursor: pointer;}.ace_folding-enabled .ace_fold-widget {display: inline-block;   }.ace_fold-widget.ace_end {background-image: url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAUAAAAFCAYAAACNbyblAAAANElEQVR42m3HwQkAMAhD0YzsRchFKI7sAikeWkrxwScEB0nh5e7KTPWimZki4tYfVbX+MNl4pyZXejUO1QAAAABJRU5ErkJggg==");}.ace_fold-widget.ace_closed {background-image: url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAMAAAAGCAYAAAAG5SQMAAAAOUlEQVR42jXKwQkAMAgDwKwqKD4EwQ26sSOkVWjgIIHAzPiCgaqiqnJHZnKICBERHN194O5b9vbLuAVRL+l0YWnZAAAAAElFTkSuQmCCXA==");}.ace_fold-widget:hover {border: 1px solid rgba(0, 0, 0, 0.3);background-color: rgba(255, 255, 255, 0.2);box-shadow: 0 1px 1px rgba(255, 255, 255, 0.7);}.ace_fold-widget:active {border: 1px solid rgba(0, 0, 0, 0.4);background-color: rgba(0, 0, 0, 0.05);box-shadow: 0 1px 1px rgba(255, 255, 255, 0.8);}.ace_dark .ace_fold-widget {background-image: url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAUAAAAFCAYAAACNbyblAAAAHklEQVQIW2P4//8/AzoGEQ7oGCaLLAhWiSwB146BAQCSTPYocqT0AAAAAElFTkSuQmCC");}.ace_dark .ace_fold-widget.ace_end {background-image: url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAUAAAAFCAYAAACNbyblAAAAH0lEQVQIW2P4//8/AxQ7wNjIAjDMgC4AxjCVKBirIAAF0kz2rlhxpAAAAABJRU5ErkJggg==");}.ace_dark .ace_fold-widget.ace_closed {background-image: url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAMAAAAFCAYAAACAcVaiAAAAHElEQVQIW2P4//+/AxAzgDADlOOAznHAKgPWAwARji8UIDTfQQAAAABJRU5ErkJggg==");}.ace_dark .ace_fold-widget:hover {box-shadow: 0 1px 1px rgba(255, 255, 255, 0.2);background-color: rgba(255, 255, 255, 0.1);}.ace_dark .ace_fold-widget:active {box-shadow: 0 1px 1px rgba(255, 255, 255, 0.2);}.ace_inline_button {border: 1px solid lightgray;display: inline-block;margin: -1px 8px;padding: 0 5px;pointer-events: auto;cursor: pointer;}.ace_inline_button:hover {border-color: gray;background: rgba(200,200,200,0.2);display: inline-block;pointer-events: auto;}.ace_fold-widget.ace_invalid {background-color: #FFB4B4;border-color: #DE5555;}.ace_fade-fold-widgets .ace_fold-widget {transition: opacity 0.4s ease 0.05s;opacity: 0;}.ace_fade-fold-widgets:hover .ace_fold-widget {transition: opacity 0.05s ease 0.05s;opacity:1;}.ace_underline {text-decoration: underline;}.ace_bold {font-weight: bold;}.ace_nobold .ace_bold {font-weight: normal;}.ace_italic {font-style: italic;}.ace_error-marker {background-color: rgba(255, 0, 0,0.2);position: absolute;z-index: 9;}.ace_highlight-marker {background-color: rgba(255, 255, 0,0.2);position: absolute;z-index: 8;}
/*# sourceURL=ace/css/ace_editor.css */</style>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add 1 to a number represented as linked list | Practice | GeeksforGeeks</title>
    <link rel="icon" href="https://media.geeksforgeeks.org/img-practice/favicon-1600291663.png" type="image/x-icon" media="none" onload="if(media!=&#39;all&#39;)media=&#39;all&#39;">
      
    
    <meta name="keywords" content="programming,coding,online, code online, online judge, practice, run code, test, expected outcome, programming competition, programming contest, online programming, online computer programming">
    <meta name="description" content="A number&amp;nbsp;N&amp;nbsp;is represented in Linked List such that each digit corresponds to a node in linked list. You need to add 1 to it.

Example 1:


Input:
LinkedList: 4-&amp;gt;5-&amp;gt;6
Output: 457&amp;nbsp;


Example 2:


Input:
LinkedList: 1-&amp;gt;2-&amp;gt;3
Ou ">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta property="og:image" content="https://media.geeksforgeeks.org/img-practice/gfg_200X200.png">
    <meta property="og:image:alt" content="GeeksforGeeks">
    <meta property="og:image:type" content="image/png">
    <meta property="og:image:width" content="200">
    <meta property="og:image:height" content="200">
    
    <link rel="stylesheet" href="./Add1 to a number represented as linked list_files/bootstrap.min.css" media="all" onload="if(media!=&#39;all&#39;)media=&#39;all&#39;">
    <link rel="stylesheet" type="text/css" href="./Add1 to a number represented as linked list_files/style-2.8.css" media="all" onload="if(media!=&#39;all&#39;)media=&#39;all&#39;">
    <link rel="stylesheet" type="text/css" href="./Add1 to a number represented as linked list_files/animate.min.css" media="all" onload="if(media!=&#39;all&#39;)media=&#39;all&#39;">
    <link href="./Add1 to a number represented as linked list_files/css" rel="stylesheet" media="all" onload="if(media!=&#39;all&#39;)media=&#39;all&#39;"> 
    <link rel="stylesheet" href="./Add1 to a number represented as linked list_files/all.css" integrity="sha384-DNOHZ68U8hZfKXOrtjWvjxusGo9WQnrNx2sqG0tfsghAvtVlRW3tvkXWZh58N9jp" crossorigin="anonymous" media="all" onload="if(media!=&#39;all&#39;)media=&#39;all&#39;"> 
    <link href="./Add1 to a number represented as linked list_files/font-awesome.min.css" rel="stylesheet" media="all" onload="if(media!=&#39;all&#39;)media=&#39;all&#39;">
    <link rel="stylesheet" href="./Add1 to a number represented as linked list_files/bootstrap-select.min.css" media="all" onload="if(media!=&#39;all&#39;)media=&#39;all&#39;">
    <link rel="stylesheet" href="./Add1 to a number represented as linked list_files/jquery.datetimepicker.min.css" media="all" onload="if(media!=&#39;all&#39;)media=&#39;all&#39;">
    <link rel="stylesheet" type="text/css" href="./Add1 to a number represented as linked list_files/cookieconsent.min.css" media="all" onload="if(media!=&#39;all&#39;)media=&#39;all&#39;">
    <link href="./Add1 to a number represented as linked list_files/common.css" rel="stylesheet" type="text/css">
    <link rel="stylesheet" href="./Add1 to a number represented as linked list_files/vja0nps.css">
    <link rel="stylesheet" href="./Add1 to a number represented as linked list_files/header-footer.css">

    <!-- Google Tag Manager -->
    <iframe src="javascript:void(0)" title="" style="width: 0px; height: 0px; border: 0px; display: none; max-width: 100%;" src="./Add1 to a number represented as linked list_files/saved_resource.html"></iframe><script src="./Add1 to a number represented as linked list_files/osd.js.download"></script><script src="./Add1 to a number represented as linked list_files/f.txt"></script><script src="./Add1 to a number represented as linked list_files/f(1).txt" id="google_shimpl"></script><script async="" src="./Add1 to a number represented as linked list_files/async-ads.js.download"></script><script async="" src="./Add1 to a number represented as linked list_files/async-ads.js.download"></script><script src="./Add1 to a number represented as linked list_files/sdk.js.download" async="" crossorigin="anonymous"></script><script type="text/javascript" async="" src="./Add1 to a number represented as linked list_files/js"></script><script type="text/javascript" async="" src="./Add1 to a number represented as linked list_files/f(2).txt"></script><script type="text/javascript" async="" src="./Add1 to a number represented as linked list_files/f(2).txt"></script><script type="text/javascript" async="" src="./Add1 to a number represented as linked list_files/js(1)"></script><script type="text/javascript" async="" src="./Add1 to a number represented as linked list_files/js(2)"></script><script type="text/javascript" async="" src="./Add1 to a number represented as linked list_files/analytics.js.download"></script><script type="text/javascript" async="" src="./Add1 to a number represented as linked list_files/f(3).txt"></script><script src="./Add1 to a number represented as linked list_files/2320390688070878" async=""></script><script id="facebook-jssdk" src="./Add1 to a number represented as linked list_files/sdk.js(1).download"></script><script async="" src="./Add1 to a number represented as linked list_files/qevents.js.download"></script><script type="text/javascript" async="" src="./Add1 to a number represented as linked list_files/f(3).txt"></script><script async="" src="./Add1 to a number represented as linked list_files/fbevents.js.download"></script><script async="" src="./Add1 to a number represented as linked list_files/analytics.js.download"></script><script async="" src="./Add1 to a number represented as linked list_files/gtm.js.download"></script><script>(function(w,d,s,l,i){w[l]=w[l]||[];w[l].push({'gtm.start':
    new Date().getTime(),event:'gtm.js'});var f=d.getElementsByTagName(s)[0],
    j=d.createElement(s),dl=l!='dataLayer'?'&l='+l:'';j.async=true;j.src=
    'https://www.googletagmanager.com/gtm.js?id='+i+dl;f.parentNode.insertBefore(j,f);
    })(window,document,'script','dataLayer','GTM-TH3MQN4');</script>
    <!-- End Google Tag Manager -->    
                <script src="./Add1 to a number represented as linked list_files/bundle.tracing.min.js.download" integrity="sha384-lSZkoLgJeNT+V/zBEZAchPik9VPNr9wvgAY6mwoMK5SO/cMsK/whVXKKdQOL1oiw" crossorigin="anonymous"></script>
            <script>
                Sentry.init({
                    dsn: "https://2c33945b23ed494b9c275cf0b3659c05@o446130.ingest.sentry.io/5424031",
                    integrations: [
                        new Sentry.Integrations.BrowserTracing(),
                    ],
                    tracesSampleRate: +0.5,
                });
            </script>
        <script src="./Add1 to a number represented as linked list_files/jquery.min.js.download"></script>
    <script src="./Add1 to a number represented as linked list_files/bootstrap.min.js.download"></script>
    <script async="" src="./Add1 to a number represented as linked list_files/jquery.datetimepicker.full.min.js.download"></script>  
    <script async="" src="./Add1 to a number represented as linked list_files/bootstrap-select.min.js.download"></script>        
    <script async="" src="./Add1 to a number represented as linked list_files/cookieconsent.min.js.download"></script>
    <script async="" src="./Add1 to a number represented as linked list_files/header-footer.js.download"></script>
    <meta property="og:title" content="Add 1 to a number represented as linked list | Practice | GeeksforGeeks ">
<script>document.title="Add 1 to a number represented as linked list | Practice | GeeksforGeeks";var def_lang ="";</script>        <script> 
        (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
        (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
        m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
        })(window,document,'script','//www.google-analytics.com/analytics.js','ga');

        ga('create', 'UA-71763465-1', 'auto');
        ga('require', 'displayfeatures');
        ga('send', 'pageview');
    </script>

    <script>
        function openGuestLoginModal() {
           if (jQuery('.header--sidebar').find('.header--nav__item').find('.login-modal-btn').length) {
                function openModalforGuests() {
                    setTimeout(function() {
                      jQuery('.header--sidebar').find('.header--nav__item').find('.login-modal-btn').trigger('click');
                    }, 5000)
                }

                function setCookie() {
                    var guest = document.cookie.indexOf('guest=');
                    if (guest == -1) {
                        date = new Date();
                        date.setTime(date.getTime() + (2 * 24 * 60 * 60 * 1000));
                        expires = "; expires=" + date.toGMTString();
                        document.cookie = "guest=yes" + expires + "; path=/";
                        openModalforGuests()
                    }
                }
                var callGuestModal = !1;
                if (localStorage.getItem('guestPageCount')) {
                    localStorage.setItem('guestPageCount', parseInt(localStorage.getItem('guestPageCount')) + 1);
                        if (parseInt(localStorage.getItem('guestPageCount')) > 2) {
                            callGuestModal = !0;
                            localStorage.removeItem('guestPageCount')
                        }
                } else if (!localStorage.getItem('guestPageCount') && document.cookie.indexOf('guest=') == -1) {
                    localStorage.setItem('guestPageCount', 1)
                }
                if (callGuestModal) {
                    setCookie()
                }
                if (!callGuestModal) {
                    setTimeout(function() {
                        setCookie()
                    }, 20000)
                }
            }
        }
        
        $(document).ready(function() {
            openGuestLoginModal();
            $('[data-toggle="popover"]').popover(); 

            $('body').on('click', 'a > #popover--button', function(e) {e.preventDefault(); return true;});
            
            var queries = document.querySelectorAll('.mediaquerydependent'),
            all = queries.length,
            cur = null,
            attr = null;
            while (all--) {
                cur = queries[all];
                if (cur.dataset.media &&
                    window.matchMedia(cur.dataset.media).matches) {
                    for (attr in cur.dataset) {
                        if (attr !== 'media') {
                            cur.setAttribute(attr, cur.dataset[attr]);
                        }
                    }
                }
            }

            window.addEventListener("load", function(){
                window.cookieconsent.initialise({
                    "palette": {
                        "popup": {
                          "background": "#3c404d",
                          "text": "#d6d6d6",
                          "font-size": "12px"
                        },
                        "button": {
                          "background": "#8bed4f"
                        }
                    },
                    "theme": "classic",
                        onStatusChange: function(status) {
                        
                        },
                        "content": {
                        "message": "We use cookies to ensure you have the best browsing experience on our website. By using our site, you acknowledge that you have read and understood our <a href=\"https://www.geeksforgeeks.org/cookie-policy/\" class=\"cc-link\" target=\"_blank\">Cookie Policy</a> & ",
                        "link": "Privacy Policy",
                        "href": "https://www.geeksforgeeks.org/privacy-policy/"
                        },
                    cookie: {
                        name : "geeksforgeeks_consent_status",
                    }
                })
            }); 
        });
   </script>

    <!-- Facebook Pixel Code -->
      <script>
        !function(f,b,e,v,n,t,s)
        {if(f.fbq)return;n=f.fbq=function(){n.callMethod?
        n.callMethod.apply(n,arguments):n.queue.push(arguments)};
        if(!f._fbq)f._fbq=n;n.push=n;n.loaded=!0;n.version='2.0';
        n.queue=[];t=b.createElement(e);t.async=!0;
        t.src=v;s=b.getElementsByTagName(e)[0];
        s.parentNode.insertBefore(t,s)}(window, document,'script',
        'https://connect.facebook.net/en_US/fbevents.js');
        fbq('init', '2320390688070878');
        fbq('track', 'PageView');
      </script>
      <noscript><img height="1" width="1" style="display:none"
        src="https://www.facebook.com/tr?id=2320390688070878&ev=PageView&noscript=1"
      /></noscript>
    <!-- End Facebook Pixel Code -->

    <!-- Global site tag (gtag.js) - Google Analytics -->
    <script async="" src="./Add1 to a number represented as linked list_files/js(3)"></script>
    <script>
        window.dataLayer = window.dataLayer || [];
        function gtag(){dataLayer.push(arguments);}
        gtag('js', new Date());
        gtag('config', 'UA-71763465-1', { 'optimize_id': 'GTM-WDSZVB6'});
    </script>

    <script>
        (function () {
            var cx = '005855190823060106138:ggjtcjog1xu';
            var gcse = document.createElement('script');
            gcse.type = 'text/javascript';
            gcse.async = true;
            gcse.src = (document.location.protocol == 'https:' ? 'https:' : 'http:') +
                '//cse.google.com/cse.js?cx=' + cx;
            var s = document.getElementsByTagName('script')[0];
            s.parentNode.insertBefore(gcse, s);
        })();
    </script>

    <!-- Global site tag (gtag.js) - Google Ads: 474915276 -->
    <script async="" src="./Add1 to a number represented as linked list_files/js(4)"></script>
    <script>
      window.dataLayer = window.dataLayer || [];
      function gtag(){dataLayer.push(arguments);}
        gtag('js', new Date());
        gtag('config', 'AW-474915276');
    </script>

    <!-- Bus Sell ad start-->
    <script type="text/javascript">
      (function(){
        var bsa_optimize=document.createElement('script');
        bsa_optimize.type='text/javascript';
        bsa_optimize.async=true;
        bsa_optimize.src='https://cdn4.buysellads.net/pub/geeksforgeeks.js?'+(new Date()-new Date()%600000);
        (document.getElementsByTagName('head')[0]||document.getElementsByTagName('body')[0]).appendChild(bsa_optimize);
      })();
    </script><script type="text/javascript" async="" src="./Add1 to a number represented as linked list_files/geeksforgeeks.js.download"></script> 
    <!-- Bus Sell ad end-->

  <script>(window.BOOMR_mq=window.BOOMR_mq||[]).push(["addVar",{"rua.upush":"false","rua.cpush":"false","rua.upre":"false","rua.cpre":"true","rua.uprl":"false","rua.cprl":"false","rua.cprf":"false","rua.trans":"SJ-ddf97b7e-36ad-4277-95e0-93c0f75c2a49","rua.cook":"true","rua.ims":"false","rua.ufprl":"false","rua.cfprl":"false"}]);</script>
                          <script>!function(a){var e="https://s.go-mpulse.net/boomerang/",t="addEventListener";if("False"=="True")a.BOOMR_config=a.BOOMR_config||{},a.BOOMR_config.PageParams=a.BOOMR_config.PageParams||{},a.BOOMR_config.PageParams.pci=!0,e="https://s2.go-mpulse.net/boomerang/";if(window.BOOMR_API_key="DRC3M-XVBSV-FUQK8-83JJR-8KUMW",function(){function n(e){a.BOOMR_onload=e&&e.timeStamp||(new Date).getTime()}if(!a.BOOMR||!a.BOOMR.version&&!a.BOOMR.snippetExecuted){a.BOOMR=a.BOOMR||{},a.BOOMR.snippetExecuted=!0;var i,_,o,r=document.createElement("iframe");if(a[t])a[t]("load",n,!1);else if(a.attachEvent)a.attachEvent("onload",n);r.src="javascript:void(0)",r.title="",r.role="presentation",(r.frameElement||r).style.cssText="width:0;height:0;border:0;display:none;",o=document.getElementsByTagName("script")[0],o.parentNode.insertBefore(r,o);try{_=r.contentWindow.document}catch(O){i=document.domain,r.src="javascript:var d=document.open();d.domain='"+i+"';void(0);",_=r.contentWindow.document}_.open()._l=function(){var a=this.createElement("script");if(i)this.domain=i;a.id="boomr-if-as",a.src=e+"DRC3M-XVBSV-FUQK8-83JJR-8KUMW",BOOMR_lstart=(new Date).getTime(),this.body.appendChild(a)},_.write("<bo"+'dy onload="document._l();">'),_.close()}}(),"".length>0)if(a&&"performance"in a&&a.performance&&"function"==typeof a.performance.setResourceTimingBufferSize)a.performance.setResourceTimingBufferSize();!function(){if(BOOMR=a.BOOMR||{},BOOMR.plugins=BOOMR.plugins||{},!BOOMR.plugins.AK){var e="true"=="true"?1:0,t="cookiepresent",n="zkhh2aix2q5bsycpe3lq-f-36ae32c3e-clientnsv4-s.akamaihd.net",i={"ak.v":"30","ak.cp":"855609","ak.ai":parseInt("547329",10),"ak.ol":"0","ak.cr":42,"ak.ipv":4,"ak.proto":"h2","ak.rid":"6eba495","ak.r":35470,"ak.a2":e,"ak.m":"dscr","ak.n":"ff","ak.bpcip":"202.142.125.0","ak.cport":32950,"ak.gh":"23.212.58.21","ak.quicv":"","ak.tlsv":"tls1.3","ak.0rtt":"","ak.csrc":"-","ak.acc":"","ak.t":"1615800023","ak.ak":"hOBiQwZUYzCg5VSAfCLimQ==PEF2aOGhfB8RNFkc54INSmwvUFuns2y4DnB3yBtNFr9Qvm/zIWK53twUjH5KsI16rRzhWd96gqZBfDtwgeP/1Q9ko/TEUW9WamPNbjtFDacYAgmCBjR5eFo2TUx3muO6zhXUxgUAG9++AKCw+Dl39ftJk5/vhc1NPzu9UISODs5wsBE4Jb7y1we3Fg2oc11EyqnzPbqL74BWAvkZ3aUUxJSS5haBT8daD4tWp3gfl8jnkiXq7wrtP0fODEYikwhkeR3Bxk7VD7ssz81B8hcRkCQq6KcEye8vyNtrvLDFziQQJIMiNxw0XV8gO+IU4eI/k/JJoGLKNpuGm5tPoYqlHvOlAJKSkyq4YLy4pacwmVNHBuCI6wXiDeM3V3KFpv2zpjJ1HVLOwSEZTdMUAZmf15vCjIHbYFps8U2mCieTWWM=","ak.pv":"33","ak.dpoabenc":""};if(""!==t)i["ak.ruds"]=t;var _={i:!1,av:function(e){var t="http.initiator";if(e&&(!e[t]||"spa_hard"===e[t]))i["ak.feo"]=void 0!==a.aFeoApplied?1:0,BOOMR.addVar(i)},rv:function(){var a=["ak.bpcip","ak.cport","ak.cr","ak.csrc","ak.gh","ak.ipv","ak.m","ak.n","ak.ol","ak.proto","ak.quicv","ak.tlsv","ak.0rtt","ak.r","ak.acc","ak.t"];BOOMR.removeVar(a)}};BOOMR.plugins.AK={akVars:i,akDNSPreFetchDomain:n,init:function(){if(!_.i){var a=BOOMR.subscribe;a("before_beacon",_.av,null,null),a("onbeacon",_.rv,null,null),_.i=!0}return this},is_complete:function(){return!0}}}}()}(window);</script><script src="./Add1 to a number represented as linked list_files/cse_element__en.js.download" type="text/javascript"></script><link type="text/css" rel="stylesheet" href="./Add1 to a number represented as linked list_files/default+en.css"><link type="text/css" rel="stylesheet" href="./Add1 to a number represented as linked list_files/default.css"><script src="./Add1 to a number represented as linked list_files/cse_element__en.js.download" type="text/javascript"></script><link type="text/css" rel="stylesheet" href="./Add1 to a number represented as linked list_files/default+en.css"><link type="text/css" rel="stylesheet" href="./Add1 to a number represented as linked list_files/default.css"><script async="" type="text/javascript" src="./Add1 to a number represented as linked list_files/gpt.js.download" dropped-by="bsaoptimize"></script><link rel="stylesheet" type="text/css" href="./Add1 to a number represented as linked list_files/prettify.css"><link rel="prefetch" as="style" href="https://c.disquscdn.com/next/embed/styles/lounge.c82b267b396dfbc10ae5113342115da8.css"><link rel="prefetch" as="script" href="https://c.disquscdn.com/next/embed/common.bundle.f485ba8b89bf2153fdb9f493ec342aed.js"><link rel="prefetch" as="script" href="https://c.disquscdn.com/next/embed/lounge.bundle.54cf549c270b597d5587d24486b38d71.js"><link rel="prefetch" as="script" href="https://disqus.com/next/config.js"><script src="./Add1 to a number represented as linked list_files/f(4).txt"></script><script src="./Add1 to a number represented as linked list_files/f(5).txt"></script><style type="text/css">.gsc-control-cse{font-family:arial, sans-serif}.gsc-control-cse .gsc-table-result{font-family:arial, sans-serif}.gsc-refinementsGradient{background:linear-gradient(to left,rgba(233,233,233,1),rgba(233,233,233,0))}.gsc-control-cse{border-color:#FFFFFF;background-color:#FFFFFF}input.gsc-input,.gsc-input-box,.gsc-input-box-hover,.gsc-input-box-focus{border-color:#4CB96B}.gsc-search-button-v2,.gsc-search-button-v2:hover,.gsc-search-button-v2:focus{border-color:#4CB96B;background-color:#4CB96B;background-image:none;filter:none}.gsc-search-button-v2 svg{fill:#FFFFFF}.gsc-tabHeader.gsc-tabhActive,.gsc-refinementHeader.gsc-refinementhActive{color:#4CB96B;border-color:#4CB96B;background-color:#FFFFFF}.gsc-tabHeader.gsc-tabhInactive,.gsc-refinementHeader.gsc-refinementhInactive{color:#4CB96B;border-color:#4CB96B;background-color:#E9E9E9}.gsc-webResult.gsc-result,.gsc-results .gsc-imageResult{border-color:#FFFFFF;background-color:#FFFFFF}.gsc-webResult.gsc-result:hover{border-color:#FFFFFF;background-color:#FFFFFF}.gs-webResult.gs-result a.gs-title:link,.gs-webResult.gs-result a.gs-title:link b,.gs-imageResult a.gs-title:link,.gs-imageResult a.gs-title:link b{color:#0000CC}.gs-webResult.gs-result a.gs-title:visited,.gs-webResult.gs-result a.gs-title:visited b,.gs-imageResult a.gs-title:visited,.gs-imageResult a.gs-title:visited b{color:#0000CC}.gs-webResult.gs-result a.gs-title:hover,.gs-webResult.gs-result a.gs-title:hover b,.gs-imageResult a.gs-title:hover,.gs-imageResult a.gs-title:hover b{color:#0000CC}.gs-webResult.gs-result a.gs-title:active,.gs-webResult.gs-result a.gs-title:active b,.gs-imageResult a.gs-title:active,.gs-imageResult a.gs-title:active b{color:#0000CC}.gsc-cursor-page{color:#0000CC}a.gsc-trailing-more-results:link{color:#0000CC}.gs-webResult:not(.gs-no-results-result):not(.gs-error-result) .gs-snippet,.gs-fileFormatType{color:#000000}.gs-webResult div.gs-visibleUrl{color:#008000}.gs-webResult div.gs-visibleUrl-short{color:#008000}.gsc-cursor-box{border-color:#FFFFFF}.gsc-results .gsc-cursor-box .gsc-cursor-page{border-color:#4CB96B;background-color:#E9E9E9;color:#4CB96B}.gsc-results .gsc-cursor-box .gsc-cursor-current-page{border-color:#4CB96B;background-color:#FFFFFF;color:#4CB96B}.gsc-webResult.gsc-result.gsc-promotion{border-color:#336699;background-color:#FFFFFF}.gsc-completion-title{color:#0000CC}.gsc-completion-snippet{color:#000000}.gs-promotion a.gs-title:link,.gs-promotion a.gs-title:link *,.gs-promotion .gs-snippet a:link{color:#0000CC}.gs-promotion a.gs-title:visited,.gs-promotion a.gs-title:visited *,.gs-promotion .gs-snippet a:visited{color:#0000CC}.gs-promotion a.gs-title:hover,.gs-promotion a.gs-title:hover *,.gs-promotion .gs-snippet a:hover{color:#0000CC}.gs-promotion a.gs-title:active,.gs-promotion a.gs-title:active *,.gs-promotion .gs-snippet a:active{color:#0000CC}.gs-promotion .gs-snippet,.gs-promotion .gs-title .gs-promotion-title-right,.gs-promotion .gs-title .gs-promotion-title-right *{color:#000000}.gs-promotion .gs-visibleUrl,.gs-promotion .gs-visibleUrl-short{color:#008000}.gcsc-find-more-on-google{color:#0000CC}.gcsc-find-more-on-google-magnifier{fill:#0000CC}</style><style type="text/css">.gscb_a{display:inline-block;font:27px/13px arial,sans-serif}.gsst_a .gscb_a{color:#a1b9ed;cursor:pointer}.gsst_a:hover .gscb_a,.gsst_a:focus .gscb_a{color:#36c}.gsst_a{display:inline-block}.gsst_a{cursor:pointer;padding:0 4px}.gsst_a:hover{text-decoration:none!important}.gsst_b{font-size:16px;padding:0 2px;position:relative;user-select:none;-webkit-user-select:none;white-space:nowrap}.gsst_e{vertical-align:middle;opacity:0.55;}.gsst_a:hover .gsst_e,.gsst_a:focus .gsst_e{opacity:0.72;}.gsst_a:active .gsst_e{opacity:1;}.gsst_f{background:white;text-align:left}.gsst_g{background-color:white;border:1px solid #ccc;border-top-color:#d9d9d9;box-shadow:0 2px 4px rgba(0,0,0,0.2);-webkit-box-shadow:0 2px 4px rgba(0,0,0,0.2);margin:-1px -3px;padding:0 6px}.gsst_h{background-color:white;height:1px;margin-bottom:-1px;position:relative;top:-1px}.gsib_a{width:100%;padding:4px 6px 0}.gsib_a,.gsib_b{vertical-align:top}.gssb_c{border:0;position:absolute;z-index:989}.gssb_e{border:1px solid #ccc;border-top-color:#d9d9d9;box-shadow:0 2px 4px rgba(0,0,0,0.2);-webkit-box-shadow:0 2px 4px rgba(0,0,0,0.2);cursor:default}.gssb_f{visibility:hidden;white-space:nowrap}.gssb_k{border:0;display:block;position:absolute;top:0;z-index:988}.gsdd_a{border:none!important}.gsq_a{padding:0}.gssb_a{padding:0 7px}.gssb_a,.gssb_a td{white-space:nowrap;overflow:hidden;line-height:22px}#gssb_b{font-size:11px;color:#36c;text-decoration:none}#gssb_b:hover{font-size:11px;color:#36c;text-decoration:underline}.gssb_g{text-align:center;padding:8px 0 7px;position:relative}.gssb_h{font-size:15px;height:28px;margin:0.2em;-webkit-appearance:button}.gssb_i{background:#eee}.gss_ifl{visibility:hidden;padding-left:5px}.gssb_i .gss_ifl{visibility:visible}a.gssb_j{font-size:13px;color:#36c;text-decoration:none;line-height:100%}a.gssb_j:hover{text-decoration:underline}.gssb_l{height:1px;background-color:#e5e5e5}.gssb_m{color:#000;background:#fff}.gssb_a{padding:0 9px}.gsib_a{padding:5px 9px 4px 9px}.gscb_a{line-height:27px}.gssb_e{border:0}.gssb_l{margin:5px 0}input.gsc-input::-webkit-input-placeholder{font-size:14px}input.gsc-input:-moz-placeholder{font-size:14px}input.gsc-input::-moz-placeholder{font-size:14px}input.gsc-input:-ms-input-placeholder{font-size:14px}input.gsc-input:focus::-webkit-input-placeholder{color:transparent}input.gsc-input:focus:-moz-placeholder{color:transparent}input.gsc-input:focus::-moz-placeholder{color:transparent}input.gsc-input:focus:-ms-input-placeholder{color:transparent}.gssb_c .gsc-completion-container{position:static}.gssb_c{z-index:5000}.gsc-completion-container table{background:transparent;font-size:inherit;font-family:inherit}.gssb_c > tbody > tr,.gssb_c > tbody > tr > td,.gssb_d,.gssb_d > tbody > tr,.gssb_d > tbody > tr > td,.gssb_e,.gssb_e > tbody > tr,.gssb_e > tbody > tr > td{padding:0;margin:0;border:0}.gssb_a table,.gssb_a table tr,.gssb_a table tr td{padding:0;margin:0;border:0}</style><style type="text/css">.gscb_a{display:inline-block;font:27px/13px arial,sans-serif}.gsst_a .gscb_a{color:#a1b9ed;cursor:pointer}.gsst_a:hover .gscb_a,.gsst_a:focus .gscb_a{color:#36c}.gsst_a{display:inline-block}.gsst_a{cursor:pointer;padding:0 4px}.gsst_a:hover{text-decoration:none!important}.gsst_b{font-size:16px;padding:0 2px;position:relative;user-select:none;-webkit-user-select:none;white-space:nowrap}.gsst_e{vertical-align:middle;opacity:0.55;}.gsst_a:hover .gsst_e,.gsst_a:focus .gsst_e{opacity:0.72;}.gsst_a:active .gsst_e{opacity:1;}.gsst_f{background:white;text-align:left}.gsst_g{background-color:white;border:1px solid #ccc;border-top-color:#d9d9d9;box-shadow:0 2px 4px rgba(0,0,0,0.2);-webkit-box-shadow:0 2px 4px rgba(0,0,0,0.2);margin:-1px -3px;padding:0 6px}.gsst_h{background-color:white;height:1px;margin-bottom:-1px;position:relative;top:-1px}.gsib_a{width:100%;padding:4px 6px 0}.gsib_a,.gsib_b{vertical-align:top}.gssb_c{border:0;position:absolute;z-index:989}.gssb_e{border:1px solid #ccc;border-top-color:#d9d9d9;box-shadow:0 2px 4px rgba(0,0,0,0.2);-webkit-box-shadow:0 2px 4px rgba(0,0,0,0.2);cursor:default}.gssb_f{visibility:hidden;white-space:nowrap}.gssb_k{border:0;display:block;position:absolute;top:0;z-index:988}.gsdd_a{border:none!important}.gsq_a{padding:0}.gssb_a{padding:0 7px}.gssb_a,.gssb_a td{white-space:nowrap;overflow:hidden;line-height:22px}#gssb_b{font-size:11px;color:#36c;text-decoration:none}#gssb_b:hover{font-size:11px;color:#36c;text-decoration:underline}.gssb_g{text-align:center;padding:8px 0 7px;position:relative}.gssb_h{font-size:15px;height:28px;margin:0.2em;-webkit-appearance:button}.gssb_i{background:#eee}.gss_ifl{visibility:hidden;padding-left:5px}.gssb_i .gss_ifl{visibility:visible}a.gssb_j{font-size:13px;color:#36c;text-decoration:none;line-height:100%}a.gssb_j:hover{text-decoration:underline}.gssb_l{height:1px;background-color:#e5e5e5}.gssb_m{color:#000;background:#fff}.gssb_a{padding:0 9px}.gsib_a{padding:5px 9px 4px 9px}.gscb_a{line-height:27px}.gssb_e{border:0}.gssb_l{margin:5px 0}input.gsc-input::-webkit-input-placeholder{font-size:14px}input.gsc-input:-moz-placeholder{font-size:14px}input.gsc-input::-moz-placeholder{font-size:14px}input.gsc-input:-ms-input-placeholder{font-size:14px}input.gsc-input:focus::-webkit-input-placeholder{color:transparent}input.gsc-input:focus:-moz-placeholder{color:transparent}input.gsc-input:focus::-moz-placeholder{color:transparent}input.gsc-input:focus:-ms-input-placeholder{color:transparent}.gssb_c .gsc-completion-container{position:static}.gssb_c{z-index:5000}.gsc-completion-container table{background:transparent;font-size:inherit;font-family:inherit}.gssb_c > tbody > tr,.gssb_c > tbody > tr > td,.gssb_d,.gssb_d > tbody > tr,.gssb_d > tbody > tr > td,.gssb_e,.gssb_e > tbody > tr,.gssb_e > tbody > tr > td{padding:0;margin:0;border:0}.gssb_a table,.gssb_a table tr,.gssb_a table tr td{padding:0;margin:0;border:0}</style><style type="text/css">.gsc-control-cse{font-family:arial, sans-serif}.gsc-control-cse .gsc-table-result{font-family:arial, sans-serif}.gsc-refinementsGradient{background:linear-gradient(to left,rgba(233,233,233,1),rgba(233,233,233,0))}.gsc-control-cse{border-color:#FFFFFF;background-color:#FFFFFF}input.gsc-input,.gsc-input-box,.gsc-input-box-hover,.gsc-input-box-focus{border-color:#4CB96B}.gsc-search-button-v2,.gsc-search-button-v2:hover,.gsc-search-button-v2:focus{border-color:#4CB96B;background-color:#4CB96B;background-image:none;filter:none}.gsc-search-button-v2 svg{fill:#FFFFFF}.gsc-tabHeader.gsc-tabhActive,.gsc-refinementHeader.gsc-refinementhActive{color:#4CB96B;border-color:#4CB96B;background-color:#FFFFFF}.gsc-tabHeader.gsc-tabhInactive,.gsc-refinementHeader.gsc-refinementhInactive{color:#4CB96B;border-color:#4CB96B;background-color:#E9E9E9}.gsc-webResult.gsc-result,.gsc-results .gsc-imageResult{border-color:#FFFFFF;background-color:#FFFFFF}.gsc-webResult.gsc-result:hover{border-color:#FFFFFF;background-color:#FFFFFF}.gs-webResult.gs-result a.gs-title:link,.gs-webResult.gs-result a.gs-title:link b,.gs-imageResult a.gs-title:link,.gs-imageResult a.gs-title:link b{color:#0000CC}.gs-webResult.gs-result a.gs-title:visited,.gs-webResult.gs-result a.gs-title:visited b,.gs-imageResult a.gs-title:visited,.gs-imageResult a.gs-title:visited b{color:#0000CC}.gs-webResult.gs-result a.gs-title:hover,.gs-webResult.gs-result a.gs-title:hover b,.gs-imageResult a.gs-title:hover,.gs-imageResult a.gs-title:hover b{color:#0000CC}.gs-webResult.gs-result a.gs-title:active,.gs-webResult.gs-result a.gs-title:active b,.gs-imageResult a.gs-title:active,.gs-imageResult a.gs-title:active b{color:#0000CC}.gsc-cursor-page{color:#0000CC}a.gsc-trailing-more-results:link{color:#0000CC}.gs-webResult:not(.gs-no-results-result):not(.gs-error-result) .gs-snippet,.gs-fileFormatType{color:#000000}.gs-webResult div.gs-visibleUrl{color:#008000}.gs-webResult div.gs-visibleUrl-short{color:#008000}.gsc-cursor-box{border-color:#FFFFFF}.gsc-results .gsc-cursor-box .gsc-cursor-page{border-color:#4CB96B;background-color:#E9E9E9;color:#4CB96B}.gsc-results .gsc-cursor-box .gsc-cursor-current-page{border-color:#4CB96B;background-color:#FFFFFF;color:#4CB96B}.gsc-webResult.gsc-result.gsc-promotion{border-color:#336699;background-color:#FFFFFF}.gsc-completion-title{color:#0000CC}.gsc-completion-snippet{color:#000000}.gs-promotion a.gs-title:link,.gs-promotion a.gs-title:link *,.gs-promotion .gs-snippet a:link{color:#0000CC}.gs-promotion a.gs-title:visited,.gs-promotion a.gs-title:visited *,.gs-promotion .gs-snippet a:visited{color:#0000CC}.gs-promotion a.gs-title:hover,.gs-promotion a.gs-title:hover *,.gs-promotion .gs-snippet a:hover{color:#0000CC}.gs-promotion a.gs-title:active,.gs-promotion a.gs-title:active *,.gs-promotion .gs-snippet a:active{color:#0000CC}.gs-promotion .gs-snippet,.gs-promotion .gs-title .gs-promotion-title-right,.gs-promotion .gs-title .gs-promotion-title-right *{color:#000000}.gs-promotion .gs-visibleUrl,.gs-promotion .gs-visibleUrl-short{color:#008000}.gcsc-find-more-on-google{color:#0000CC}.gcsc-find-more-on-google-magnifier{fill:#0000CC}</style><meta http-equiv="origin-trial" content="A+b/H0b8RPXNaJgaNFpO0YOFuGK6myDQXlwnJB3SwzvNMfcndat4DZYMrP4ClJIzYWo3/yP2S+8FTZ/lpqbPAAEAAABueyJvcmlnaW4iOiJodHRwczovL2ltYXNkay5nb29nbGVhcGlzLmNvbTo0NDMiLCJmZWF0dXJlIjoiVHJ1c3RUb2tlbnMiLCJleHBpcnkiOjE2MjYyMjA3OTksImlzVGhpcmRQYXJ0eSI6dHJ1ZX0="><meta http-equiv="origin-trial" content="A9ZgbRtm4pU3oZiuNzOsKcC8ppFSZdcjP2qYcdQrFKVzkmiWH1kdYY1Mi9x7G8+PS8HV9Ha9Cz0gaMdKsiVZIgMAAAB7eyJvcmlnaW4iOiJodHRwczovL2RvdWJsZWNsaWNrLm5ldDo0NDMiLCJmZWF0dXJlIjoiVHJ1c3RUb2tlbnMiLCJleHBpcnkiOjE2MjYyMjA3OTksImlzU3ViZG9tYWluIjp0cnVlLCJpc1RoaXJkUGFydHkiOnRydWV9"><meta http-equiv="origin-trial" content="AxL6oBxcpn5rQDPKSAs+d0oxNyJYq2/4esBUh3Yx5z8QfcLu+AU8iFCXYRcr/CEEfDnkxxLTsvXPJFQBxHfvkgMAAACBeyJvcmlnaW4iOiJodHRwczovL2dvb2dsZXRhZ3NlcnZpY2VzLmNvbTo0NDMiLCJmZWF0dXJlIjoiVHJ1c3RUb2tlbnMiLCJleHBpcnkiOjE2MjYyMjA3OTksImlzU3ViZG9tYWluIjp0cnVlLCJpc1RoaXJkUGFydHkiOnRydWV9"><meta http-equiv="origin-trial" content="A9KPtG5kl3oLTk21xqynDPGQ5t18bSOpwt0w6kGa6dEWbuwjpffmdUpR3W+faZDubGT+KIk2do0BX2ca16x8qAcAAACBeyJvcmlnaW4iOiJodHRwczovL2dvb2dsZXN5bmRpY2F0aW9uLmNvbTo0NDMiLCJmZWF0dXJlIjoiVHJ1c3RUb2tlbnMiLCJleHBpcnkiOjE2MjYyMjA3OTksImlzU3ViZG9tYWluIjp0cnVlLCJpc1RoaXJkUGFydHkiOnRydWV9"><meta http-equiv="origin-trial" content="A3HucHUo1oW9s+9kIKz8mLkbcmdaj5lxt3eiIMp1Nh49dkkBlg1Fhg4Fd/r0vL69mRRA36YutI9P/lJUfL8csQoAAACFeyJvcmlnaW4iOiJodHRwczovL2RvdWJsZWNsaWNrLm5ldDo0NDMiLCJmZWF0dXJlIjoiQ29udmVyc2lvbk1lYXN1cmVtZW50IiwiZXhwaXJ5IjoxNjI2MjIwNzk5LCJpc1N1YmRvbWFpbiI6dHJ1ZSwiaXNUaGlyZFBhcnR5Ijp0cnVlfQ=="><script src="./Add1 to a number represented as linked list_files/pubads_impl_2021030901.js.download" async=""></script><style type="text/css">.MathJax_Hover_Frame {border-radius: .25em; -webkit-border-radius: .25em; -moz-border-radius: .25em; -khtml-border-radius: .25em; box-shadow: 0px 0px 15px #83A; -webkit-box-shadow: 0px 0px 15px #83A; -moz-box-shadow: 0px 0px 15px #83A; -khtml-box-shadow: 0px 0px 15px #83A; border: 1px solid #A6D ! important; display: inline-block; position: absolute}
.MathJax_Menu_Button .MathJax_Hover_Arrow {position: absolute; cursor: pointer; display: inline-block; border: 2px solid #AAA; border-radius: 4px; -webkit-border-radius: 4px; -moz-border-radius: 4px; -khtml-border-radius: 4px; font-family: 'Courier New',Courier; font-size: 9px; color: #F0F0F0}
.MathJax_Menu_Button .MathJax_Hover_Arrow span {display: block; background-color: #AAA; border: 1px solid; border-radius: 3px; line-height: 0; padding: 4px}
.MathJax_Hover_Arrow:hover {color: white!important; border: 2px solid #CCC!important}
.MathJax_Hover_Arrow:hover span {background-color: #CCC!important}
</style><style type="text/css">#MathJax_About {position: fixed; left: 50%; width: auto; text-align: center; border: 3px outset; padding: 1em 2em; background-color: #DDDDDD; color: black; cursor: default; font-family: message-box; font-size: 120%; font-style: normal; text-indent: 0; text-transform: none; line-height: normal; letter-spacing: normal; word-spacing: normal; word-wrap: normal; white-space: nowrap; float: none; z-index: 201; border-radius: 15px; -webkit-border-radius: 15px; -moz-border-radius: 15px; -khtml-border-radius: 15px; box-shadow: 0px 10px 20px #808080; -webkit-box-shadow: 0px 10px 20px #808080; -moz-box-shadow: 0px 10px 20px #808080; -khtml-box-shadow: 0px 10px 20px #808080; filter: progid:DXImageTransform.Microsoft.dropshadow(OffX=2, OffY=2, Color='gray', Positive='true')}
#MathJax_About.MathJax_MousePost {outline: none}
.MathJax_Menu {position: absolute; background-color: white; color: black; width: auto; padding: 2px; border: 1px solid #CCCCCC; margin: 0; cursor: default; font: menu; text-align: left; text-indent: 0; text-transform: none; line-height: normal; letter-spacing: normal; word-spacing: normal; word-wrap: normal; white-space: nowrap; float: none; z-index: 201; box-shadow: 0px 10px 20px #808080; -webkit-box-shadow: 0px 10px 20px #808080; -moz-box-shadow: 0px 10px 20px #808080; -khtml-box-shadow: 0px 10px 20px #808080; filter: progid:DXImageTransform.Microsoft.dropshadow(OffX=2, OffY=2, Color='gray', Positive='true')}
.MathJax_MenuItem {padding: 2px 2em; background: transparent}
.MathJax_MenuArrow {position: absolute; right: .5em; padding-top: .25em; color: #666666; font-size: .75em}
.MathJax_MenuActive .MathJax_MenuArrow {color: white}
.MathJax_MenuArrow.RTL {left: .5em; right: auto}
.MathJax_MenuCheck {position: absolute; left: .7em}
.MathJax_MenuCheck.RTL {right: .7em; left: auto}
.MathJax_MenuRadioCheck {position: absolute; left: 1em}
.MathJax_MenuRadioCheck.RTL {right: 1em; left: auto}
.MathJax_MenuLabel {padding: 2px 2em 4px 1.33em; font-style: italic}
.MathJax_MenuRule {border-top: 1px solid #CCCCCC; margin: 4px 1px 0px}
.MathJax_MenuDisabled {color: GrayText}
.MathJax_MenuActive {background-color: Highlight; color: HighlightText}
.MathJax_MenuDisabled:focus, .MathJax_MenuLabel:focus {background-color: #E8E8E8}
.MathJax_ContextMenu:focus {outline: none}
.MathJax_ContextMenu .MathJax_MenuItem:focus {outline: none}
#MathJax_AboutClose {top: .2em; right: .2em}
.MathJax_Menu .MathJax_MenuClose {top: -10px; left: -10px}
.MathJax_MenuClose {position: absolute; cursor: pointer; display: inline-block; border: 2px solid #AAA; border-radius: 18px; -webkit-border-radius: 18px; -moz-border-radius: 18px; -khtml-border-radius: 18px; font-family: 'Courier New',Courier; font-size: 24px; color: #F0F0F0}
.MathJax_MenuClose span {display: block; background-color: #AAA; border: 1.5px solid; border-radius: 18px; -webkit-border-radius: 18px; -moz-border-radius: 18px; -khtml-border-radius: 18px; line-height: 0; padding: 8px 0 6px}
.MathJax_MenuClose:hover {color: white!important; border: 2px solid #CCC!important}
.MathJax_MenuClose:hover span {background-color: #CCC!important}
.MathJax_MenuClose:hover:focus {outline: none}
</style><style type="text/css">.MathJax_Preview .MJXf-math {color: inherit!important}
</style><style type="text/css">.MJX_Assistive_MathML {position: absolute!important; top: 0; left: 0; clip: rect(1px, 1px, 1px, 1px); padding: 1px 0 0 0!important; border: 0!important; height: 1px!important; width: 1px!important; overflow: hidden!important; display: block!important; -webkit-touch-callout: none; -webkit-user-select: none; -khtml-user-select: none; -moz-user-select: none; -ms-user-select: none; user-select: none}
.MJX_Assistive_MathML.MJX_Assistive_MathML_Block {width: 100%!important}
</style><style type="text/css">#MathJax_Zoom {position: absolute; background-color: #F0F0F0; overflow: auto; display: block; z-index: 301; padding: .5em; border: 1px solid black; margin: 0; font-weight: normal; font-style: normal; text-align: left; text-indent: 0; text-transform: none; line-height: normal; letter-spacing: normal; word-spacing: normal; word-wrap: normal; white-space: nowrap; float: none; -webkit-box-sizing: content-box; -moz-box-sizing: content-box; box-sizing: content-box; box-shadow: 5px 5px 15px #AAAAAA; -webkit-box-shadow: 5px 5px 15px #AAAAAA; -moz-box-shadow: 5px 5px 15px #AAAAAA; -khtml-box-shadow: 5px 5px 15px #AAAAAA; filter: progid:DXImageTransform.Microsoft.dropshadow(OffX=2, OffY=2, Color='gray', Positive='true')}
#MathJax_ZoomOverlay {position: absolute; left: 0; top: 0; z-index: 300; display: inline-block; width: 100%; height: 100%; border: 0; padding: 0; margin: 0; background-color: white; opacity: 0; filter: alpha(opacity=0)}
#MathJax_ZoomFrame {position: relative; display: inline-block; height: 0; width: 0}
#MathJax_ZoomEventTrap {position: absolute; left: 0; top: 0; z-index: 302; display: inline-block; border: 0; padding: 0; margin: 0; background-color: white; opacity: 0; filter: alpha(opacity=0)}
</style><style type="text/css">.MathJax_Preview {color: #888}
#MathJax_Message {position: fixed; left: 1em; bottom: 1.5em; background-color: #E6E6E6; border: 1px solid #959595; margin: 0px; padding: 2px 8px; z-index: 102; color: black; font-size: 80%; width: auto; white-space: nowrap}
#MathJax_MSIE_Frame {position: absolute; top: 0; left: 0; width: 0px; z-index: 101; border: 0px; margin: 0px; padding: 0px}
.MathJax_Error {color: #CC0000; font-style: italic}
</style><style type="text/css">.MJXp-script {font-size: .8em}
.MJXp-right {-webkit-transform-origin: right; -moz-transform-origin: right; -ms-transform-origin: right; -o-transform-origin: right; transform-origin: right}
.MJXp-bold {font-weight: bold}
.MJXp-italic {font-style: italic}
.MJXp-scr {font-family: MathJax_Script,'Times New Roman',Times,STIXGeneral,serif}
.MJXp-frak {font-family: MathJax_Fraktur,'Times New Roman',Times,STIXGeneral,serif}
.MJXp-sf {font-family: MathJax_SansSerif,'Times New Roman',Times,STIXGeneral,serif}
.MJXp-cal {font-family: MathJax_Caligraphic,'Times New Roman',Times,STIXGeneral,serif}
.MJXp-mono {font-family: MathJax_Typewriter,'Times New Roman',Times,STIXGeneral,serif}
.MJXp-largeop {font-size: 150%}
.MJXp-largeop.MJXp-int {vertical-align: -.2em}
.MJXp-math {display: inline-block; line-height: 1.2; text-indent: 0; font-family: 'Times New Roman',Times,STIXGeneral,serif; white-space: nowrap; border-collapse: collapse}
.MJXp-display {display: block; text-align: center; margin: 1em 0}
.MJXp-math span {display: inline-block}
.MJXp-box {display: block!important; text-align: center}
.MJXp-box:after {content: " "}
.MJXp-rule {display: block!important; margin-top: .1em}
.MJXp-char {display: block!important}
.MJXp-mo {margin: 0 .15em}
.MJXp-mfrac {margin: 0 .125em; vertical-align: .25em}
.MJXp-denom {display: inline-table!important; width: 100%}
.MJXp-denom > * {display: table-row!important}
.MJXp-surd {vertical-align: top}
.MJXp-surd > * {display: block!important}
.MJXp-script-box > *  {display: table!important; height: 50%}
.MJXp-script-box > * > * {display: table-cell!important; vertical-align: top}
.MJXp-script-box > *:last-child > * {vertical-align: bottom}
.MJXp-script-box > * > * > * {display: block!important}
.MJXp-mphantom {visibility: hidden}
.MJXp-munderover {display: inline-table!important}
.MJXp-over {display: inline-block!important; text-align: center}
.MJXp-over > * {display: block!important}
.MJXp-munderover > * {display: table-row!important}
.MJXp-mtable {vertical-align: .25em; margin: 0 .125em}
.MJXp-mtable > * {display: inline-table!important; vertical-align: middle}
.MJXp-mtr {display: table-row!important}
.MJXp-mtd {display: table-cell!important; text-align: center; padding: .5em 0 0 .5em}
.MJXp-mtr > .MJXp-mtd:first-child {padding-left: 0}
.MJXp-mtr:first-child > .MJXp-mtd {padding-top: 0}
.MJXp-mlabeledtr {display: table-row!important}
.MJXp-mlabeledtr > .MJXp-mtd:first-child {padding-left: 0}
.MJXp-mlabeledtr:first-child > .MJXp-mtd {padding-top: 0}
.MJXp-merror {background-color: #FFFF88; color: #CC0000; border: 1px solid #CC0000; padding: 1px 3px; font-style: normal; font-size: 90%}
.MJXp-scale0 {-webkit-transform: scaleX(.0); -moz-transform: scaleX(.0); -ms-transform: scaleX(.0); -o-transform: scaleX(.0); transform: scaleX(.0)}
.MJXp-scale1 {-webkit-transform: scaleX(.1); -moz-transform: scaleX(.1); -ms-transform: scaleX(.1); -o-transform: scaleX(.1); transform: scaleX(.1)}
.MJXp-scale2 {-webkit-transform: scaleX(.2); -moz-transform: scaleX(.2); -ms-transform: scaleX(.2); -o-transform: scaleX(.2); transform: scaleX(.2)}
.MJXp-scale3 {-webkit-transform: scaleX(.3); -moz-transform: scaleX(.3); -ms-transform: scaleX(.3); -o-transform: scaleX(.3); transform: scaleX(.3)}
.MJXp-scale4 {-webkit-transform: scaleX(.4); -moz-transform: scaleX(.4); -ms-transform: scaleX(.4); -o-transform: scaleX(.4); transform: scaleX(.4)}
.MJXp-scale5 {-webkit-transform: scaleX(.5); -moz-transform: scaleX(.5); -ms-transform: scaleX(.5); -o-transform: scaleX(.5); transform: scaleX(.5)}
.MJXp-scale6 {-webkit-transform: scaleX(.6); -moz-transform: scaleX(.6); -ms-transform: scaleX(.6); -o-transform: scaleX(.6); transform: scaleX(.6)}
.MJXp-scale7 {-webkit-transform: scaleX(.7); -moz-transform: scaleX(.7); -ms-transform: scaleX(.7); -o-transform: scaleX(.7); transform: scaleX(.7)}
.MJXp-scale8 {-webkit-transform: scaleX(.8); -moz-transform: scaleX(.8); -ms-transform: scaleX(.8); -o-transform: scaleX(.8); transform: scaleX(.8)}
.MJXp-scale9 {-webkit-transform: scaleX(.9); -moz-transform: scaleX(.9); -ms-transform: scaleX(.9); -o-transform: scaleX(.9); transform: scaleX(.9)}
.MathJax_PHTML .noError {vertical-align: ; font-size: 90%; text-align: left; color: black; padding: 1px 3px; border: 1px solid}
</style><script async="" data-ad-client="ca-pub-9454946816537646" src="./Add1 to a number represented as linked list_files/f(6).txt" data-checked-head="true"></script><style>#bsa-zone_1609265214983-8_123456 {
   text-align: center !important;
}

.bsa_sticky.bsa_sticky_stuck > [id$=direct_iframe_container], .bsa_sticky.bsa_sticky_stuck > [id$=__container__]{
    margin: 100px 0px 0px !important;
}</style><meta http-equiv="origin-trial" content="A+b/H0b8RPXNaJgaNFpO0YOFuGK6myDQXlwnJB3SwzvNMfcndat4DZYMrP4ClJIzYWo3/yP2S+8FTZ/lpqbPAAEAAABueyJvcmlnaW4iOiJodHRwczovL2ltYXNkay5nb29nbGVhcGlzLmNvbTo0NDMiLCJmZWF0dXJlIjoiVHJ1c3RUb2tlbnMiLCJleHBpcnkiOjE2MjYyMjA3OTksImlzVGhpcmRQYXJ0eSI6dHJ1ZX0="><meta http-equiv="origin-trial" content="A9ZgbRtm4pU3oZiuNzOsKcC8ppFSZdcjP2qYcdQrFKVzkmiWH1kdYY1Mi9x7G8+PS8HV9Ha9Cz0gaMdKsiVZIgMAAAB7eyJvcmlnaW4iOiJodHRwczovL2RvdWJsZWNsaWNrLm5ldDo0NDMiLCJmZWF0dXJlIjoiVHJ1c3RUb2tlbnMiLCJleHBpcnkiOjE2MjYyMjA3OTksImlzU3ViZG9tYWluIjp0cnVlLCJpc1RoaXJkUGFydHkiOnRydWV9"><meta http-equiv="origin-trial" content="AxL6oBxcpn5rQDPKSAs+d0oxNyJYq2/4esBUh3Yx5z8QfcLu+AU8iFCXYRcr/CEEfDnkxxLTsvXPJFQBxHfvkgMAAACBeyJvcmlnaW4iOiJodHRwczovL2dvb2dsZXRhZ3NlcnZpY2VzLmNvbTo0NDMiLCJmZWF0dXJlIjoiVHJ1c3RUb2tlbnMiLCJleHBpcnkiOjE2MjYyMjA3OTksImlzU3ViZG9tYWluIjp0cnVlLCJpc1RoaXJkUGFydHkiOnRydWV9"><meta http-equiv="origin-trial" content="A9KPtG5kl3oLTk21xqynDPGQ5t18bSOpwt0w6kGa6dEWbuwjpffmdUpR3W+faZDubGT+KIk2do0BX2ca16x8qAcAAACBeyJvcmlnaW4iOiJodHRwczovL2dvb2dsZXN5bmRpY2F0aW9uLmNvbTo0NDMiLCJmZWF0dXJlIjoiVHJ1c3RUb2tlbnMiLCJleHBpcnkiOjE2MjYyMjA3OTksImlzU3ViZG9tYWluIjp0cnVlLCJpc1RoaXJkUGFydHkiOnRydWV9"><meta http-equiv="origin-trial" content="A3HucHUo1oW9s+9kIKz8mLkbcmdaj5lxt3eiIMp1Nh49dkkBlg1Fhg4Fd/r0vL69mRRA36YutI9P/lJUfL8csQoAAACFeyJvcmlnaW4iOiJodHRwczovL2RvdWJsZWNsaWNrLm5ldDo0NDMiLCJmZWF0dXJlIjoiQ29udmVyc2lvbk1lYXN1cmVtZW50IiwiZXhwaXJ5IjoxNjI2MjIwNzk5LCJpc1N1YmRvbWFpbiI6dHJ1ZSwiaXNUaGlyZFBhcnR5Ijp0cnVlfQ=="><link rel="preload" href="./Add1 to a number represented as linked list_files/f(7).txt" as="script"><script type="text/javascript" src="./Add1 to a number represented as linked list_files/f(7).txt"></script><link rel="preload" href="./Add1 to a number represented as linked list_files/f(8).txt" as="script"><script type="text/javascript" src="./Add1 to a number represented as linked list_files/f(8).txt"></script><script src="./Add1 to a number represented as linked list_files/theme-dracula.js.download"></script><script src="./Add1 to a number represented as linked list_files/mode-javascript.js.download"></script><script src="./Add1 to a number represented as linked list_files/mode-java.js.download"></script><style type="text/css" data-fbcssmodules="css:fb.css.basecss:fb.css.dialog css:fb.css.iframewidget">.fb_hidden{position:absolute;top:-10000px;z-index:10001}.fb_reposition{overflow:hidden;position:relative}.fb_invisible{display:none}.fb_reset{background:none;border:0;border-spacing:0;color:#000;cursor:auto;direction:ltr;font-family:"lucida grande", tahoma, verdana, arial, sans-serif;font-size:11px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:1;margin:0;overflow:visible;padding:0;text-align:left;text-decoration:none;text-indent:0;text-shadow:none;text-transform:none;visibility:visible;white-space:normal;word-spacing:normal}.fb_reset>div{overflow:hidden}@keyframes fb_transform{from{opacity:0;transform:scale(.95)}to{opacity:1;transform:scale(1)}}.fb_animate{animation:fb_transform .3s forwards}
.fb_dialog{background:rgba(82, 82, 82, .7);position:absolute;top:-10000px;z-index:10001}.fb_dialog_advanced{border-radius:8px;padding:10px}.fb_dialog_content{background:#fff;color:#373737}.fb_dialog_close_icon{background:url(https://static.xx.fbcdn.net/rsrc.php/v3/yq/r/IE9JII6Z1Ys.png) no-repeat scroll 0 0 transparent;cursor:pointer;display:block;height:15px;position:absolute;right:18px;top:17px;width:15px}.fb_dialog_mobile .fb_dialog_close_icon{left:5px;right:auto;top:5px}.fb_dialog_padding{background-color:transparent;position:absolute;width:1px;z-index:-1}.fb_dialog_close_icon:hover{background:url(https://static.xx.fbcdn.net/rsrc.php/v3/yq/r/IE9JII6Z1Ys.png) no-repeat scroll 0 -15px transparent}.fb_dialog_close_icon:active{background:url(https://static.xx.fbcdn.net/rsrc.php/v3/yq/r/IE9JII6Z1Ys.png) no-repeat scroll 0 -30px transparent}.fb_dialog_iframe{line-height:0}.fb_dialog_content .dialog_title{background:#6d84b4;border:1px solid #365899;color:#fff;font-size:14px;font-weight:bold;margin:0}.fb_dialog_content .dialog_title>span{background:url(https://static.xx.fbcdn.net/rsrc.php/v3/yd/r/Cou7n-nqK52.gif) no-repeat 5px 50%;float:left;padding:5px 0 7px 26px}body.fb_hidden{height:100%;left:0;margin:0;overflow:visible;position:absolute;top:-10000px;transform:none;width:100%}.fb_dialog.fb_dialog_mobile.loading{background:url(https://static.xx.fbcdn.net/rsrc.php/v3/ya/r/3rhSv5V8j3o.gif) white no-repeat 50% 50%;min-height:100%;min-width:100%;overflow:hidden;position:absolute;top:0;z-index:10001}.fb_dialog.fb_dialog_mobile.loading.centered{background:none;height:auto;min-height:initial;min-width:initial;width:auto}.fb_dialog.fb_dialog_mobile.loading.centered #fb_dialog_loader_spinner{width:100%}.fb_dialog.fb_dialog_mobile.loading.centered .fb_dialog_content{background:none}.loading.centered #fb_dialog_loader_close{clear:both;color:#fff;display:block;font-size:18px;padding-top:20px}#fb-root #fb_dialog_ipad_overlay{background:rgba(0, 0, 0, .4);bottom:0;left:0;min-height:100%;position:absolute;right:0;top:0;width:100%;z-index:10000}#fb-root #fb_dialog_ipad_overlay.hidden{display:none}.fb_dialog.fb_dialog_mobile.loading iframe{visibility:hidden}.fb_dialog_mobile .fb_dialog_iframe{position:sticky;top:0}.fb_dialog_content .dialog_header{background:linear-gradient(from(#738aba), to(#2c4987));border-bottom:1px solid;border-color:#043b87;box-shadow:white 0 1px 1px -1px inset;color:#fff;font:bold 14px Helvetica, sans-serif;text-overflow:ellipsis;text-shadow:rgba(0, 30, 84, .296875) 0 -1px 0;vertical-align:middle;white-space:nowrap}.fb_dialog_content .dialog_header table{height:43px;width:100%}.fb_dialog_content .dialog_header td.header_left{font-size:12px;padding-left:5px;vertical-align:middle;width:60px}.fb_dialog_content .dialog_header td.header_right{font-size:12px;padding-right:5px;vertical-align:middle;width:60px}.fb_dialog_content .touchable_button{background:linear-gradient(from(#4267B2), to(#2a4887));background-clip:padding-box;border:1px solid #29487d;border-radius:3px;display:inline-block;line-height:18px;margin-top:3px;max-width:85px;padding:4px 12px;position:relative}.fb_dialog_content .dialog_header .touchable_button input{background:none;border:none;color:#fff;font:bold 12px Helvetica, sans-serif;margin:2px -12px;padding:2px 6px 3px 6px;text-shadow:rgba(0, 30, 84, .296875) 0 -1px 0}.fb_dialog_content .dialog_header .header_center{color:#fff;font-size:16px;font-weight:bold;line-height:18px;text-align:center;vertical-align:middle}.fb_dialog_content .dialog_content{background:url(https://static.xx.fbcdn.net/rsrc.php/v3/y9/r/jKEcVPZFk-2.gif) no-repeat 50% 50%;border:1px solid #4a4a4a;border-bottom:0;border-top:0;height:150px}.fb_dialog_content .dialog_footer{background:#f5f6f7;border:1px solid #4a4a4a;border-top-color:#ccc;height:40px}#fb_dialog_loader_close{float:left}.fb_dialog.fb_dialog_mobile .fb_dialog_close_icon{visibility:hidden}#fb_dialog_loader_spinner{animation:rotateSpinner 1.2s linear infinite;background-color:transparent;background-image:url(https://static.xx.fbcdn.net/rsrc.php/v3/yD/r/t-wz8gw1xG1.png);background-position:50% 50%;background-repeat:no-repeat;height:24px;width:24px}@keyframes rotateSpinner{0%{transform:rotate(0deg)}100%{transform:rotate(360deg)}}
.fb_iframe_widget{display:inline-block;position:relative}.fb_iframe_widget span{display:inline-block;position:relative;text-align:justify}.fb_iframe_widget iframe{position:absolute}.fb_iframe_widget_fluid_desktop,.fb_iframe_widget_fluid_desktop span,.fb_iframe_widget_fluid_desktop iframe{max-width:100%}.fb_iframe_widget_fluid_desktop iframe{min-width:220px;position:relative}.fb_iframe_widget_lift{z-index:1}.fb_iframe_widget_fluid{display:inline}.fb_iframe_widget_fluid span{width:100%}</style><link id="doubtSupportCss" rel="stylesheet" type="text/css" href="./Add1 to a number represented as linked list_files/comment.css" media="all"><style></style></head>

<body style="margin: 0;" class="header-body" data-new-gr-c-s-check-loaded="14.998.0" data-gr-ext-installed="" data-new-gr-c-s-loaded="14.998.0"><div role="dialog" aria-live="polite" aria-label="cookieconsent" aria-describedby="cookieconsent:desc" class="cc-window cc-banner cc-type-info cc-theme-classic cc-bottom cc-color-override-74746687 cc-invisible" style="display: none;"><!--googleoff: all--><span id="cookieconsent:desc" class="cc-message">We use cookies to ensure you have the best browsing experience on our website. By using our site, you acknowledge that you have read and understood our <a href="https://www.geeksforgeeks.org/cookie-policy/" class="cc-link" target="_blank">Cookie Policy</a> &amp;  <a aria-label="learn more about cookies" role="button" tabindex="0" class="cc-link" href="https://www.geeksforgeeks.org/privacy-policy/" target="_blank">Privacy Policy</a></span><div class="cc-compliance"><a aria-label="dismiss cookie message" role="button" tabindex="0" class="cc-btn cc-dismiss">Got it!</a></div><!--googleon: all--></div><div id="MathJax_Message" style="display: none;"></div>
    <i id="utoken" style="display:none">e3cd26ac30d97c795aeb24d5dd2ed0617aecec6631363135383030303233</i>
    <div class="header-top__notification display-none">
        <div class="header-top__text">
            Geeksforgeeks
        </div>
        <div class="header-top__times">
            <i class="material-icons">close</i>
        </div>
    </div>
        <!-- DO NOT MODIFY -->
        <!-- Quora Pixel Code (JS Helper) -->
        <script>
                !function(q,e,v,n,t,s){if(q.qp) return; n=q.qp=function(){n.qp?n.qp.apply(n,arguments):n.queue.push(arguments);}; n.queue=[];t=document.createElement(e);t.async=!0;t.src=v; s=document.getElementsByTagName(e)[0]; s.parentNode.insertBefore(t,s);}(window, 'script', 'https://a.quora.com/qevents.js');
                qp('init', '54ba43eaeb644b908aa476d8e9f908c2');
                qp('track', 'ViewContent');
        </script>
        <noscript><img height="1" width="1" style="display:none" src="https://q.quora.com/_/ad/54ba43eaeb644b908aa476d8e9f908c2/pixel?tag=ViewContent&noscript=1"/></noscript>
        <!-- End of Quora Pixel Code -->

        <!-- Google Tag Manager (noscript) -->
        <noscript><iframe src="https://www.googletagmanager.com/ns.html?id=GTM-TH3MQN4"
        height="0" width="0" style="display:none;visibility:hidden"></iframe></noscript>
        <!-- End Google Tag Manager (noscript) -->        

        <script>
            window.fbAsyncInit = function() {
                FB.init({
                  appId      : '534961220012939',
                  xfbml      : true,
                  version    : 'v2.5'
                });
            };

            (function(d, s, id) {
                var js, fjs = d.getElementsByTagName(s)[0];
                if (d.getElementById(id)) {return;}
                js = d.createElement(s); js.id = id;
                js.src = "//connect.facebook.net/en_US/sdk.js";
                fjs.parentNode.insertBefore(js, fjs);
            }(document, 'script', 'facebook-jssdk'));
        </script>
        <script>
          (function() {
            var cx = '005855190823060106138:ggjtcjog1xu';
            var gcse = document.createElement('script');
            gcse.type = 'text/javascript';
            gcse.async = true;
            gcse.src = 'https://cse.google.com/cse.js?cx=' + cx;
            var s = document.getElementsByTagName('script')[0];
            s.parentNode.insertBefore(gcse, s);
          })();
        </script>

        <!-- Global site tag (gtag.js) - Google Ads: 796001856 -->
        <script async="" src="./Add1 to a number represented as linked list_files/js(5)"></script>
        <script>
          window.dataLayer = window.dataLayer || [];
          function gtag(){dataLayer.push(arguments);}
          gtag('js', new Date());

          gtag('config', 'AW-796001856');
        </script>

    <div class="header-hellobar-container stick-me">
        <div class="header-main__wrapper">
        <a href="https://practice.geeksforgeeks.org/home/" class="header-main__logo">
            <div class="_logo">
                <svg xmlns="http://www.w3.org/2000/svg" width="76.533" height="39.026" viewBox="0 0 76.533 39.026">
                    <path d="M2380.7,6597.866a12.252,12.252,0,0,0-.261-1.513l-30.726-.027a12.545,12.545,0,0,1,.908-3.443,12.337,12.337,0,0,1,2.739-4.044,12.151,12.151,0,0,1,4.018-2.581,12.634,12.634,0,0,1,14.3,3.051l4.852-4.748a18.176,18.176,0,0,0-6.131-4.331,20.037,20.037,0,0,0-8.112-1.564,20.25,20.25,0,0,0-7.671,1.459,19.158,19.158,0,0,0-6.261,4.07,19.584,19.584,0,0,0-4.226,6.184,18.7,18.7,0,0,0-1.487,5.947h-.2a18.674,18.674,0,0,0-1.489-5.947,19.544,19.544,0,0,0-4.226-6.184,19.133,19.133,0,0,0-6.261-4.07,21.354,21.354,0,0,0-15.783.1,18.2,18.2,0,0,0-6.131,4.331l4.853,4.748a13.264,13.264,0,0,1,14.3-3.051,12.131,12.131,0,0,1,4.017,2.581,12.323,12.323,0,0,1,2.74,4.044,12.527,12.527,0,0,1,.908,3.443l-30.726.027a12.256,12.256,0,0,0-.261,1.513,15,15,0,0,0-.1,1.773,20.713,20.713,0,0,0,1.1,6.783,15.709,15.709,0,0,0,3.443,5.686,17.309,17.309,0,0,0,6,4.123,20.587,20.587,0,0,0,7.983,1.46,20.226,20.226,0,0,0,7.669-1.46,19.086,19.086,0,0,0,6.261-4.07,19.506,19.506,0,0,0,4.226-6.184,18.163,18.163,0,0,0,1.153-3.629h.871a18.27,18.27,0,0,0,1.151,3.629,19.545,19.545,0,0,0,4.226,6.184,19.111,19.111,0,0,0,6.261,4.07,20.241,20.241,0,0,0,7.671,1.46,20.572,20.572,0,0,0,7.981-1.46,17.282,17.282,0,0,0,6-4.123,15.717,15.717,0,0,0,3.445-5.686,20.726,20.726,0,0,0,1.1-6.783A15.259,15.259,0,0,0,2380.7,6597.866Zm-46.245,5.608a12.1,12.1,0,0,1-2.766,4.043,12.467,12.467,0,0,1-4.043,2.583,14.378,14.378,0,0,1-9.939.052,11.776,11.776,0,0,1-3.522-2.218,8.459,8.459,0,0,1-1.8-2.374,13.476,13.476,0,0,1-1.173-3.208l23.658,0A11.487,11.487,0,0,1,2334.457,6603.475Zm38.236,2.086a8.466,8.466,0,0,1-1.8,2.374,11.771,11.771,0,0,1-3.522,2.218,14.378,14.378,0,0,1-9.939-.052,12.491,12.491,0,0,1-4.044-2.583,12.088,12.088,0,0,1-2.765-4.043,11.427,11.427,0,0,1-.415-1.126h11.92v0h11.739A13.509,13.509,0,0,1,2372.692,6605.561Z" transform="translate(-2304.273 -6578.666)" fill="#2f8d46"></path>
                </svg>
                <svg xmlns="http://www.w3.org/2000/svg" width="107.168" height="22.01" viewBox="0 0 107.168 22.01">
                <path xmlns="http://www.w3.org/2000/svg" id="Path_407" data-name="Path 407" d="M-2099.961-1967.559a6.921,6.921,0,0,1,7.112-7.2c3.924,0,6.905,2.833,6.905,7.17,0,.384-.029.8-.06,1.239h-10.977a3.95,3.95,0,0,0,4.25,3.394,4.493,4.493,0,0,0,3.9-2.007l2.3,1.151a6.974,6.974,0,0,1-6.314,3.542A6.961,6.961,0,0,1-2099.961-1967.559Zm3.01-1.121h8.115a3.76,3.76,0,0,0-3.983-3.394A3.863,3.863,0,0,0-2096.951-1968.681Zm-17.763,1.151a7.175,7.175,0,0,1,7.436-7.23,6.91,6.91,0,0,1,5.371,2.361l-1.919,1.8a4.523,4.523,0,0,0-3.393-1.445,4.461,4.461,0,0,0-4.6,4.514,4.486,4.486,0,0,0,4.6,4.544,4.527,4.527,0,0,0,3.393-1.445l1.919,1.8a6.913,6.913,0,0,1-5.371,2.361A7.2,7.2,0,0,1-2114.715-1967.53Zm-31.985,0a7.175,7.175,0,0,1,7.436-7.23,6.906,6.906,0,0,1,5.37,2.361l-1.918,1.8a4.523,4.523,0,0,0-3.393-1.445,4.461,4.461,0,0,0-4.6,4.514,4.724,4.724,0,0,0,1.085,2.988,4.441,4.441,0,0,0,3.518,1.556,4.527,4.527,0,0,0,3.393-1.445l1.918,1.8a6.909,6.909,0,0,1-5.37,2.361A7.2,7.2,0,0,1-2146.7-1967.53Zm-17.911,0c0-4.1,2.921-7.23,6.817-7.23a5.382,5.382,0,0,1,4.78,2.419v-2.066h2.892v13.781h-2.892v-2.331a5.584,5.584,0,0,1-4.9,2.686C-2161.513-1960.27-2164.611-1963.281-2164.611-1967.53Zm2.921,0a4.4,4.4,0,0,0,4.279,4.544,4.473,4.473,0,0,0,4.367-4.544,4.513,4.513,0,0,0-4.426-4.514A4.383,4.383,0,0,0-2161.689-1967.53Zm40.66,6.9v-13.781h2.892v13.781Zm-8.586,0v-11.361h-2.479v-2.42h2.479v-5.164h2.891v5.164h2.951v2.42h-2.951v11.361Zm-45.264,0v-13.781h2.921v3.1c.708-2.419,2.1-3.452,3.866-3.452a5.305,5.305,0,0,1,2.36.5l-.5,2.745a4.88,4.88,0,0,0-2.036-.473c-2.508,0-3.689,2.686-3.689,6.4v4.957Zm-17.232,0v-20.332h8.144c4.368,0,6.2,3.217,6.2,6.433,0,3.246-1.83,6.374-6.2,6.374h-5.1v7.525Zm3.039-10.3h4.928c2.361,0,3.334-1.8,3.334-3.6s-.944-3.658-3.217-3.658h-5.046Zm67.513-8.5a1.915,1.915,0,0,1,1.976-1.859,1.9,1.9,0,0,1,1.977,1.859,1.9,1.9,0,0,1-1.977,1.859A1.915,1.915,0,0,1-2121.56-1979.422Z" transform="translate(2192.612 1981.781)" fill="#0f2b3c" stroke="rgba(0,0,0,0)" stroke-width="1"></path>
            </svg>
            </div>
        </a>
        <div class="header-main__container">
            <span class="hamburger-menu" style="display: none;"> <!-- sidebar on tab and mobile view -->
                <span class="gfg-burger-1"></span>
                <span class="gfg-burger-2"></span>
                <span class="gfg-burger-3"></span>
            </span>
            <ul class="header-main__list" style="display: none;">
                <li class="header-main__list-item" aria-expanded="false" data-expandable="false">
                    <a href="https://practice.geeksforgeeks.org/explore" class="remove-anchor__decoration" target="_self">Problems</a>
                </li>
                <li class="header-main__list-item" data-parent="true" aria-expanded="false" data-expandable="true">
                    <a href="https://practice.geeksforgeeks.org/courses" class="remove-anchor__decoration" target="_self">Courses</a>
                </li>
                <li class="header-main__list-item" aria-expanded="false" data-expandable="false">
                    <a href="https://practice.geeksforgeeks.org/jobs" class="remove-anchor__decoration" target="_self">Get Hired</a>
                </li>
                            </ul>
            <ul class="header-main__left-list" data-type="0" data-nl="false">
                <li class="header-main__left-list-item header-search p-relative login" aria-expanded="false" data-expandable="false" style="display: none;">
                    <div id="___gcse_0"><div class="gsc-control-cse gsc-control-cse-en"><div class="gsc-control-wrapper-cse" dir="ltr"><form class="gsc-search-box gsc-search-box-tools" accept-charset="utf-8"><table cellspacing="0" cellpadding="0" class="gsc-search-box"><tbody><tr><td class="gsc-input"><div class="gsc-input-box" id="gsc-iw-id1"><table cellspacing="0" cellpadding="0" id="gs_id50" class="gstl_50 gsc-input" style="width: 100%; padding: 0px;"><tbody><tr><td id="gs_tti50" class="gsib_a"><input autocomplete="off" type="text" size="10" class="gsc-input" name="search" title="search" id="gsc-i-id1" dir="ltr" spellcheck="false" style="width: 100%; padding: 0px; border: none; margin: 0px; height: auto; background: url(&quot;https://www.google.com/cse/static/images/1x/en/branding.png&quot;) left center no-repeat rgb(255, 255, 255); outline: none;"></td><td class="gsib_b"><div class="gsst_b" id="gs_st50" dir="ltr"><a class="gsst_a" href="javascript:void(0)" title="Clear search box" role="button" style="display: none;"><span class="gscb_a" id="gs_cb50" aria-hidden="true">×</span></a></div></td></tr></tbody></table></div></td><td class="gsc-search-button"><button class="gsc-search-button gsc-search-button-v2"><svg width="13" height="13" viewBox="0 0 13 13"><title>search</title><path d="m4.8495 7.8226c0.82666 0 1.5262-0.29146 2.0985-0.87438 0.57232-0.58292 0.86378-1.2877 0.87438-2.1144 0.010599-0.82666-0.28086-1.5262-0.87438-2.0985-0.59352-0.57232-1.293-0.86378-2.0985-0.87438-0.8055-0.010599-1.5103 0.28086-2.1144 0.87438-0.60414 0.59352-0.8956 1.293-0.87438 2.0985 0.021197 0.8055 0.31266 1.5103 0.87438 2.1144 0.56172 0.60414 1.2665 0.8956 2.1144 0.87438zm4.4695 0.2115 3.681 3.6819-1.259 1.284-3.6817-3.7 0.0019784-0.69479-0.090043-0.098846c-0.87973 0.76087-1.92 1.1413-3.1207 1.1413-1.3553 0-2.5025-0.46363-3.4417-1.3909s-1.4088-2.0686-1.4088-3.4239c0-1.3553 0.4696-2.4966 1.4088-3.4239 0.9392-0.92727 2.0864-1.3969 3.4417-1.4088 1.3553-0.011889 2.4906 0.45771 3.406 1.4088 0.9154 0.95107 1.379 2.0924 1.3909 3.4239 0 1.2126-0.38043 2.2588-1.1413 3.1385l0.098834 0.090049z"></path></svg></button></td><td class="gsc-clear-button"><div class="gsc-clear-button" title="clear results">&nbsp;</div></td></tr></tbody></table></form><div class="gsc-results-wrapper-overlay"><div class="gsc-results-close-btn" tabindex="0"></div><div class="gsc-positioningWrapper"><div class="gsc-tabsAreaInvisible"><div aria-label="refinement" role="tab" class="gsc-tabHeader gsc-inline-block gsc-tabhActive">Custom Search</div><span class="gs-spacer"> </span></div></div><div class="gsc-positioningWrapper"><div class="gsc-tabsAreaInvisible"></div></div><div class="gsc-above-wrapper-area-invisible"><table cellspacing="0" cellpadding="0" class="gsc-above-wrapper-area-container"><tbody><tr><td class="gsc-result-info-container"><div class="gsc-result-info-invisible"></div></td><td class="gsc-orderby-container"><div class="gsc-orderby-invisible"><div class="gsc-orderby-label gsc-inline-block">Sort by:</div><div class="gsc-option-menu-container gsc-inline-block"><div class="gsc-selected-option-container gsc-inline-block"><div class="gsc-selected-option">Relevance</div><div class="gsc-option-selector"></div></div><div class="gsc-option-menu-invisible"><div class="gsc-option-menu-item gsc-option-menu-item-highlighted"><div class="gsc-option">Relevance</div></div><div class="gsc-option-menu-item"><div class="gsc-option">Date</div></div></div></div></div></td></tr></tbody></table></div><div class="gsc-adBlockInvisible"></div><div class="gsc-wrapper"><div class="gsc-adBlockInvisible"></div><div class="gsc-resultsbox-invisible"><div class="gsc-resultsRoot gsc-tabData gsc-tabdActive"><div><div class="gsc-expansionArea"></div></div></div></div></div></div><div class="gsc-modal-background-image" tabindex="0"></div></div></div></div>
                    <i class="material-icons gcse-search__close-n display-none">close</i>
                </li>
                <li class="header-main__left-list-item header-search-icon" aria-expanded="false" data-expandable="false" style="display: none;">
                    <img class="gcse-search__icon-n header--nav__link" src="./Add1 to a number represented as linked list_files/search_mobile-1598438259.svg" style="display: none;">
                </li>
                                    <li class="header-main__left-list-item header-score" title="Score" style="margin-right: 1.6rem; cursor: pointer;">
                        <img width="25" height="25" src="./Add1 to a number represented as linked list_files/header-points-1605114253.svg">
                        <span class="userScore">348</span>
                        <img class="scoreUp" style="display: none;" src="./Add1 to a number represented as linked list_files/score_up-1605171496.svg" width="12" height="12">
                        <img class="scoreDown" style="display:none;" src="./Add1 to a number represented as linked list_files/score_down-1605171720.svg" width="12" height="12">
                    </li>
                    <li class="header-main__left-list-item notify" aria-expanded="false" data-expandable="false">
                        <a class="header--notification__trigger header--nav__link"><img class="notification-icon" src="./Add1 to a number represented as linked list_files/notification_web-1598591743.svg"></a>
                        <div class="header--notification__badge" style=""></div>
                        <div class="header--notification__content" style="display: none;">
                            <div class="header--notification__top">
                                <strong>Notifications</strong>
                                <a class="notification--archive pull-right">Archive All</a>
                            </div>
                            <div class="header--notification__list">
                                <center><div class="header--loader"></div></center>
                            </div>
                            <div class="notifications--show__all">
                                <a class="notifications--showMore" href="https://practice.geeksforgeeks.org/notifications/">Show All</a>
                            </div>
                        </div>
                    </li>
                                                <li class="header-main__left-list-item" style="margin-top: auto;margin-bottom: auto;" aria-expanded="false" data-expandable="true">
                    <div class="header-main__profile">
                        <img class="header--user__avatar" src="./Add1 to a number represented as linked list_files/user_web-1598433228.svg">
                    </div>
                    <ul class="mega-dropdown">
                                                <li>
                            <a class="remove-anchor__decoration" href="https://practice.geeksforgeeks.org/myCourses">
                                <span class="material-icons">book</span>
                                <span>My Courses</span>
                            </a>
                        </li>
                        <li>
                            <a class="remove-anchor__decoration" href="https://auth.geeksforgeeks.org/user/mdwasif7894/practice/">
                                <span class="material-icons">person</span>
                                <span>My Profile</span>
                            </a>
                        </li>
                        <li>
                            <a class="remove-anchor__decoration" href="https://auth.geeksforgeeks.org/edit-profile.php">
                                <span class="material-icons">edit</span>
                                <span>Edit Profile</span>
                            </a>
                        </li>
                        <li>
                            <a class="remove-anchor__decoration" href="https://practice.geeksforgeeks.org/leaderboard">
                                <span class="material-icons">leaderboard</span>
                                <span>Leaderboard</span>
                            </a>
                        </li>
                        <li>
                            <a class="remove-anchor__decoration" href="https://practice.geeksforgeeks.org/transactions">
                                <span class="material-icons">restore</span>
                                <span>My Transactions</span>
                            </a>
                        </li>
                        <li>
                            <a class="remove-anchor__decoration" href="https://practice.geeksforgeeks.org/logout.php/?to=https://practice.geeksforgeeks.org/problems/add-1-to-a-number-represented-as-linked-list/1">
                                <span class="material-icons">exit_to_app</span>
                                <span>Logout</span>
                            </a>
                        </li>
                    </ul>
                </li>
                            </ul>
        </div>
        <div class="gfg-overlay display-none" id="gfg-overlay"></div>
        <div class="header-sidebar__wrapper">
            <ul class="header-sidebar__list">
                                <li class="header-sidebar__list-item" style="text-align:center;">
                    <img style="max-width: 100px; margin-bottom: 10px;" class="header--user__avatar" src="./Add1 to a number represented as linked list_files/user_web-1598433228.svg">
                    <div style="display: flex; justify-content: start; margin-bottom: 20px;">
                        <a style="margin-left: 40px; display:flex; justify-content: start;" href="https://auth.geeksforgeeks.org/user/mdwasif7894/practice/">
                            <span style="position: relative;" class="material-icons">person</span>
                            <span>My Profile</span>
                        </a>
                        <a style="margin-left: 40px; display:flex; justify-content: start;" href="https://auth.geeksforgeeks.org/logout.php/?to=https://practice.geeksforgeeks.org/problems/add-1-to-a-number-represented-as-linked-list/1" target="_self">
                            <span style="position: relative;" class="material-icons">exit_to_app</span>
                            <span>Logout</span>
                        </a>
                    </div>
                </li>
                <li class="header-sidebar__list-item" style="text-align:center;">
                    <a style="margin-left: 65px; display:flex; justify-content: start;" href="https://practice.geeksforgeeks.org/transactions" target="_self">
                        <span style="position: relative;" class="material-icons">restore</span>
                        <span>My Transactions</span>
                    </a>
                </li>
                                <li class="header-sidebar__list-item">
                    <a href="https://practice.geeksforgeeks.org/explore" target="_self">Problems</a>
                </li>
                <li class="header-sidebar__list-item">
                    <a href="https://practice.geeksforgeeks.org/courses" target="_self">Courses</a>
                </li>
                <li class="header-sidebar__list-item">
                    <a href="https://practice.geeksforgeeks.org/jobs" target="_self">Get Hired</a>
                </li>
                <li class="header-sidebar__list-item">
                    <a href="https://practice.geeksforgeeks.org/discussion/all/" target="_self">Discussion</a>
                </li>
            </ul>
            <div class="" style="height: 80px;"></div>
        </div>

        
        
        </div>  <!-- header-main__wrapper stick-me -->
    </div>
    <!-- Modal for Custom GCSE result display -->
    <div id="displayModal" class="modal fade" role="dialog" style="display:none;">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="error-message"></div>
                <div class="modal-header">
                    <button onclick="closeDisplayModal(event)" type="button" class="close" data-dismiss="modal">×</button>
                    <h2 class="modal-title" id="dmTitle"></h2>
                </div>
                <div class="modal-body" id="dmBody">
                    <div id="modal-dm-content"></div>
                    <div class="modal-overlay" aria-hidden="true">
                        <span class="loader__animation"></span>
                    </div>
                    <!-- body -->
                </div>
                <div class="modal-footer">
                    <!-- button -->
                </div>
            </div>
        </div>
    </div>
    <div class="modal fade" id="commentModalHeader" role="success" style="display:none;">
        <div class="modal-dialog ">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal">×</button>
                    <h4 class="modal-title">Message </h4>
                </div>
                <div class="modal-body">
                    <div class="form-group">
                        <div class="modal-body">
                            <p>Error</p>
                        </div>
                    </div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">OK</button>
                </div>
            </div>
        </div>
    </div>
    <div class="modal fade" id="reportIssueHeader" tabindex="-1" role="dialog" style="display:none;">
        <div class="modal-dialog modal-lg" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span></button>
                    <h4 class="modal-title text-center" id="myModalLabel">Note: For issues in your code/test-cases, please use Comment-System of that particular problem.</h4>
                </div>
                <div class="modal-body">
                    <form class="form-horizontal" role="form">
                        <div class="form-group">
                          <label class="col-sm-1 control-label" for="inputTestCase">Details</label>
                            <div class="col-sm-11">
                              <textarea id="issueDescription" class="form-control" rows="7" cols="100" name="issueDescription"></textarea>
                          </div>
                        </div>
                    </form>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal" style="float:left;">Cancel</button>
                    <button type="button" class="btn btn-default" data-dismiss="modal" id="reportIssueHeaderMail" style="float:right;">Send</button>
                </div>
            </div>
        </div>
    </div>
    <!-- End of custom modal -->

        <div class="header--batches__button" style="display: none;">
        LIVE&nbsp;&nbsp;&nbsp;BATCHES
    </div>
    <div class="header--batches__content">
    </div>
    
<script>
    var curPageUrl = 'https://practice.geeksforgeeks.org/problems/add-1-to-a-number-represented-as-linked-list/1';
</script>

    
    <div class="container-fluid">
        <div id="loaderMask" style="display:none;width: 100%;height: 100%;top: 0;left: 0;background: #0006;padding: 20em 0% 0% 48em;z-index: 1000000;position: fixed;">
            <h3><i class="fa fa-spin fa-spinner" style="font-size: 2em;"></i></h3>
        </div>

                <div class="iframe-top-div" style="display:none;background-repeat: no-repeat;background-image: url(&#39;https://media.geeksforgeeks.org/img-practice/gfg_rev.gif&#39;)" id="class-div-js">
            <span id="taking-time-to-join" style="padding:3px;position: absolute;margin-top: 60vh;margin-left: auto;margin-right:auto;">
                <center>If you are facing any issue or this is taking too long, please <a href="https://practice.geeksforgeeks.org/problems/add-1-to-a-number-represented-as-linked-list/1" class="join-link">click</a> to join directly.</center>
            </span>
            <iframe id="class-iframe-src" src="./Add1 to a number represented as linked list_files/saved_resource(1).html" allow="camera;microphone *" width="100%" height="100%" style="max-width: 100%;"></iframe>
        </div>
        <div style="z-index: 1000;position: fixed;display:none;" class="cancel-class-section col-sm-1 col-sm-offset-10">
            <button style="color: red;background: white;border: unset;padding: 10px;margin: 10px;width: 120%;" class="cancel-cls-btn">Exit</button>
        </div>

<link rel="stylesheet" href="./Add1 to a number represented as linked list_files/gfg-problems.css">

<div class="problem-bg"></div>

<link rel="stylesheet" href="./Add1 to a number represented as linked list_files/bootstrap-select.min(1).css">
<script>
    var DOMAIN = "practice";
    var problemSlug = 'add-1-to-a-number-represented-as-linked-list';
    var currentProblem = {"problem_languages":{"cpp":"C++ (g++ 5.4)","java":"Java (1.8)","python3":"Python3","javascript":"Javascript (Node v12.19.0)"},"default_lang":"java","default_code":"import java.util.*;\nimport java.lang.*;\nimport java.io.*;\nclass GFG\n {\n\tpublic static void main (String[] args)\n\t {\n\t      Scanner sc = new Scanner(System.in);\n\t      int tc = sc.nextInt();\n\t      while(tc-- > 0){\n\t      int n;\n\t      n = sc.nextInt();\n\t      int arr[] = new int[n];\n\t      for(int i=0; i<n; i++)\n\t       arr[i] = sc.nextInt();\n\t }\n}","initial_user_func":{"cpp":{"initial_code":"\/\/Initial template for C++\n\n#include <bits\/stdc++.h> \nusing namespace std; \n\nstruct Node\n{\n    int data;\n    struct Node* next;\n    \n    Node(int x){\n        data = x;\n        next = NULL;\n    }\n};\n\nvoid printList(Node* node) \n{ \n    while (node != NULL) { \n        cout << node->data; \n        node = node->next; \n    }  \n    cout<<\"\\n\";\n} \n\n\/\/Position this line where user code will be pasted.\n\nint main() \n{ \n    int t;\n    cin>>t;\n    while(t--)\n    {\n        string s;\n        cin>>s;\n        \n        Node* head = new Node( s[0]-'0' );\n        Node* tail = head;\n        for(int i=1; i<s.size(); i++)\n        {\n            tail->next = new Node( s[i]-'0' );\n            tail = tail->next;\n        }\n        Solution ob;\n        head = ob.addOne(head);\n        printList(head); \n    }\n    return 0; \n} \n","user_code":"\/\/User function template for C++\n\n\/* \n\nstruct Node\n{\n    int data;\n    struct Node* next;\n    \n    Node(int x){\n        data = x;\n        next = NULL;\n    }\n};\n\n*\/\n\nclass Solution\n{\n    public:\n    Node* addOne(Node *head) \n    {\n        \/\/ Your Code here\n        \/\/ return head of list after adding one\n    }\n};","created_at_timestamp":1615398537,"updated_at_timestamp":1615398537},"java":{"initial_code":"\nimport java.io.*;\nimport java.util.*;\nclass Node\n{\n    int data;\n    Node next;\n    \n    Node(int x)\n    {\n        data = x;\n        next = null;\n    }\n}\nclass GfG\n{\n    public static void printList(Node node) \n    { \n        while (node != null)\n        { \n            System.out.print(node.data);\n            node = node.next; \n        }  \n        System.out.println();\n    } \n    public static void main(String args[])throws IOException\n        {\n            Scanner sc = new Scanner(System.in);\n            int t = sc.nextInt();\n            while(t-->0)\n                {\n                    String s = sc.next();\n                    Node head = new Node( s.charAt(0) - '0' );\n                    Node tail = head;\n                    for(int i=1; i<s.length(); i++)\n                    {\n                        tail.next = new Node( s.charAt(i) - '0' );\n                        tail = tail.next;\n                    }\n                    Solution obj = new Solution();\n                    head = obj.addOne(head);\n                    printList(head); \n                }\n        }\n}","user_code":"\/*\nclass Node{\n    int data;\n    Node next;\n    \n    Node(int x){\n        data = x;\n        next = null;\n    }\n} \n*\/\n\nclass Solution\n{\n    public static Node addOne(Node head) \n    { \n        \/\/code here.\n    }\n}\n","created_at_timestamp":1615398537,"updated_at_timestamp":1615398537},"python3":{"initial_code":"#Initial Template for Python 3\n\n# Node Class\nclass Node:\n    def __init__(self, data):   # data -> value stored in node\n        self.data = data\n        self.next = None\n\n# Linked List Class\nclass LinkedList:\n    def __init__(self):\n        self.head = None\n        self.tail = None\n\n    # creates a new node with given value and appends it at the end of the linked list\n    def insert(self, value):\n        if self.head is None:\n            self.head = Node(value)\n            self.tail = self.head\n        else:\n            self.tail.next = Node(value)\n            self.tail = self.tail.next\n\ndef PrintList(head):\n    while head:\n        print(head.data,end='')\n        head = head.next\n\nif __name__ == '__main__':\n    t=int(input())\n    for _ in range(t):\n        \n        num = input()\n        ll = LinkedList() # create a new linked list 'll1'.\n        for digit in num:\n            ll.insert(int(digit))  # add to the end of the list\n        \n        resHead = Solution().addOne(ll.head)\n        PrintList(resHead)\n        print()\n\n","user_code":"#User function Template for python3\n\n'''\n\nclass Node:\n    def __init__(self, data):   # data -> value stored in node\n        self.data = data\n        self.next = None\n'''\n\nclass Solution:\n    def addOne(self,head):\n        #Returns new head of linked List.","created_at_timestamp":1615398537,"updated_at_timestamp":1615398537},"javascript":{"initial_code":"\/\/Initial Template for javascript\n\n'use strict';\n\nprocess.stdin.resume();\nprocess.stdin.setEncoding('utf-8');\n\nlet inputString = '';\nlet currentLine = 0;\n\nprocess.stdin.on('data', inputStdin => {\n    inputString += inputStdin;\n});\n\nprocess.stdin.on('end', _ => {\n    inputString = inputString.trim().split('\\n').map(string => {\n        return string.trim();\n    });\n    \n    main();    \n});\n\nfunction readLine() {\n    return inputString[currentLine++];\n}\n\nclass Node{\n    constructor(data){\n        this.data = data;\n        this.next = null;\n    }\n}\n\nlet head = null;\n\nfunction findNode(head, search_for)\n{\n    let current = head;\n    while (current !== null)\n    {\n        if (current.data == search_for)\n            break;\n        current = current.next;\n    }\n    return current;\n}\n\nfunction printlist(head){\n    let current = head; \n    let s='';\n    while (current !== null)\n    {\n        s+=current.data+\" \";\n        current = current.next;\n    }\n    console.log(s);\n}\n\n\nfunction main() {\n    let t = parseInt(readLine());\n    let i = 0;\n    for(;i<t;i++)\n    {\n        let s = readLine();\n        head = new Node(s[0]-'0');\n        let tail = head;\n        for(let i=1;i<s.length;i++){\n            tail.next = new Node(s[i]-'0');\n            tail = tail.next;\n        }\n        let obj = new Solution();\n        let newHead = obj.addOne(head);\n        printlist(newHead);\n        \n    }\n}\n\n","user_code":"\/\/User function Template for javascript\n\n\/**\n * @param {Node} node\n * @return {Node} node\n*\/\n\n\n\/*\nclass Node{\n    constructor(data){\n        this.data = data;\n        this.next = null;\n    }\n}\n\nlet head;\nThis is method only submission.\nYou only need to complete the below method.\n*\/\n\nclass Solution {\n    addOne(node)\n    {\n        \/\/your code here\n    }\n}\n","created_at_timestamp":1615398537,"updated_at_timestamp":1615398537}}}; 
    var courseDefaultLang = '';
</script>


    <!-- <a class="btn problems-menu" data-toggle="collapse" data-target=".navbar-collapse" href="#"> -->
    <div class="problems-menu">
      <!-- <span> -->
      <!-- <i class="fa fa-bars fa-3x" aria-hidden="true"></i> -->
        <span class="gfg-bar-1"></span>
        <span class="gfg-bar-2"></span>
        <span class="gfg-bar-3"></span>
      <!-- </span> -->
    </div>

<div class="problems-list-menu col-sm-12 col-md-4 p-menu-close">
        <!-- <div class="problems-list-menu__navbar"> -->
          <div class="panel">
            <div class="panel-heading problems-list-menu__navbar-header row">
              <!-- <div class="row"> -->
                <div class="problems-list-menu__navbar_logo">
                  <div class="col-sm-9" style="margin-left: 6px;">
                    <img class="pull-left" src="./Add1 to a number represented as linked list_files/gfg-menu-logo-0209192809.png" style="max-width:90%">
                  </div>
                  <div class="col-sm-3">
                    <a class="pull-right menu-close-icon" data-toggle="collapse" data-target=".problems-list-menu-remove"> <img src="./Add1 to a number represented as linked list_files/menu-close-icon.svg" width="28" height="28"> </a>
                  </div>
                </div>  
              <!-- </div> -->
            <!-- <div class="row"> -->
              <!-- <div class="panel">
                <div class="panel-heading problems-list-menu__navbar-header row"> -->
                  <div class="row zero-row">
                    <div class="col-sm-6">
                                                <a class="back-to-track pull-left" href="https://practice.geeksforgeeks.org/explore/" id="backToExplore"> <i class="fas fa-angle-left"></i> Back To Explore Page </a>
                                
                    </div>
                                      </div>

                                    
            </div>

                <div class="panel-body problems-list-menu__navbar-body">
                  
                  <div class="problems-list-menu__navbar-body-list"><ul class="problems-list-menu__navbar-body-list__group"><li> <a href="https://practice.geeksforgeeks.org/problems/earthquake-and-the-paint-shop4518/0/"> <div class="problems-list-menu__navbar-body-list__item">Earthquake and the Paint Shop</div><i class=" pull-right far fa-circle" style="color:#fff;"></i></a> </li><li> <a href="https://practice.geeksforgeeks.org/problems/geek-and-function-v/0/"> <div class="problems-list-menu__navbar-body-list__item">Geek and Function |V</div><i class=" pull-right far fa-circle" style="color:#fff;"></i></a> </li><li> <a href="https://practice.geeksforgeeks.org/problems/sort-the-array0055/0/"> <div class="problems-list-menu__navbar-body-list__item">Sort The Array</div><i class=" pull-right far fa-circle" style="color:#fff;"></i></a> </li><li> <a href="https://practice.geeksforgeeks.org/problems/lower-case-to-upper-case3410/0/"> <div class="problems-list-menu__navbar-body-list__item">Lower case to upper case</div><i class=" pull-right far fa-circle" style="color:#fff;"></i></a> </li><li> <a href="https://practice.geeksforgeeks.org/problems/preorder-traversal-iterative/0/"> <div class="problems-list-menu__navbar-body-list__item">Preorder traversal (Iterative)</div><i class=" pull-right far fa-circle" style="color:#fff;"></i></a> </li><li> <a href="https://practice.geeksforgeeks.org/problems/geek-onacci-number/0/"> <div class="problems-list-menu__navbar-body-list__item">Geek-onacci Number</div><i class=" pull-right far fa-circle" style="color:#fff;"></i></a> </li><li> <a href="https://practice.geeksforgeeks.org/problems/insertion-sort-for-singly-linked-list/0/"> <div class="problems-list-menu__navbar-body-list__item">Insertion Sort for Singly Linked List</div><i class=" pull-right far fa-circle" style="color:#fff;"></i></a> </li><li> <a href="https://practice.geeksforgeeks.org/problems/sum-of-query-i1920/0/"> <div class="problems-list-menu__navbar-body-list__item">Sum of Query I</div><i class=" pull-right far fa-circle" style="color:#fff;"></i></a> </li><li> <a href="https://practice.geeksforgeeks.org/problems/sum-of-two-numbers-without-using-arithmetic-operators/0/"> <div class="problems-list-menu__navbar-body-list__item">Sum of two numbers without using arithmetic operators</div><i class=" pull-right far fa-circle" style="color:#fff;"></i></a> </li><li> <a href="https://practice.geeksforgeeks.org/problems/find-the-n-th-character5925/0/"> <div class="problems-list-menu__navbar-body-list__item">Find the N-th character</div><i class=" pull-right far fa-circle" style="color:#fff;"></i></a> </li><li> <a href="https://practice.geeksforgeeks.org/problems/efficiently-sorting-number-from-0-to-n2-15444/0/"> <div class="problems-list-menu__navbar-body-list__item">Efficiently sorting numbers in range from 0 to n^2 - 1</div><i class=" pull-right far fa-circle" style="color:#fff;"></i></a> </li><li> <a href="https://practice.geeksforgeeks.org/problems/print-diagonally1623/0/"> <div class="problems-list-menu__navbar-body-list__item">Anti Diagonal Traversal of Matrix</div><i class=" pull-right far fa-circle" style="color:#fff;"></i></a> </li><li> <a href="https://practice.geeksforgeeks.org/problems/segregate-even-and-odd-nodes-in-a-linked-list5035/0/"> <div class="problems-list-menu__navbar-body-list__item">Segregate even and odd nodes in a Link List</div><i class=" pull-right far fa-circle" style="color:#fff;"></i></a> </li><li> <a href="https://practice.geeksforgeeks.org/problems/multiply-two-polynomals0721/0/"> <div class="problems-list-menu__navbar-body-list__item">Multiply two polynomials</div><i class=" pull-right far fa-circle" style="color:#fff;"></i></a> </li><li> <a href="https://practice.geeksforgeeks.org/problems/postorder-traversal-iterative/0/"> <div class="problems-list-menu__navbar-body-list__item">Postorder Traversal (Iterative)</div><i class=" pull-right far fa-circle" style="color:#fff;"></i></a> </li><li> <a href="https://practice.geeksforgeeks.org/problems/nitika-and-her-queries4804/0/"> <div class="problems-list-menu__navbar-body-list__item">Nitika and her queries</div><i class=" pull-right far fa-circle" style="color:#fff;"></i></a> </li><li> <a href="https://practice.geeksforgeeks.org/problems/2b9978653b4d905d12c04387a60e16464ef40733/0/"> <div class="problems-list-menu__navbar-body-list__item">Shortest Prime Path</div><i class=" pull-right far fa-circle" style="color:#fff;"></i></a> </li><li> <a href="https://practice.geeksforgeeks.org/problems/inorder-traversal-iterative/0/"> <div class="problems-list-menu__navbar-body-list__item">Inorder Traversal (Iterative)</div><i class=" pull-right far fa-circle" style="color:#fff;"></i></a> </li><li> <a href="https://practice.geeksforgeeks.org/problems/eulerian-path-in-an-undirected-graph5052/0/"> <div class="problems-list-menu__navbar-body-list__item">Eulerian Path in an Undirected Graph</div><i class=" pull-right far fa-circle" style="color:#fff;"></i></a> </li><li> <a href="https://practice.geeksforgeeks.org/problems/akku-and-binary-numbers0902/0/"> <div class="problems-list-menu__navbar-body-list__item">Akku and Binary Numbers</div><i class=" pull-right far fa-circle" style="color:#fff;"></i></a> </li><li> <a href="https://practice.geeksforgeeks.org/problems/java-hashmap1033/0/"> <div class="problems-list-menu__navbar-body-list__item">Java Collection | Set 3 (HashMap) Part-1</div><i class=" pull-right far fa-circle" style="color:#fff;"></i></a> </li><li> <a href="https://practice.geeksforgeeks.org/problems/product-is-even-or-odd3020/0/"> <div class="problems-list-menu__navbar-body-list__item">Product is even or odd?</div><i class=" pull-right far fa-circle" style="color:#fff;"></i></a> </li><li> <a href="https://practice.geeksforgeeks.org/problems/mean-of-range-in-array2123/0/"> <div class="problems-list-menu__navbar-body-list__item">Mean of range in array</div><i class=" pull-right far fa-circle" style="color:#fff;"></i></a> </li><li> <a href="https://practice.geeksforgeeks.org/problems/chinky-and-diamonds3340/0/"> <div class="problems-list-menu__navbar-body-list__item">Maximum Diamonds</div><i class=" pull-right far fa-circle" style="color:#fff;"></i></a> </li><li> <a href="https://practice.geeksforgeeks.org/problems/program-to-print-reciprocal-of-letters36233623/0/"> <div class="problems-list-menu__navbar-body-list__item">Program to print reciprocal of letters - copy</div><i class=" pull-right far fa-circle" style="color:#fff;"></i></a> </li><li> <a href="https://practice.geeksforgeeks.org/problems/sum-of-product-of-x-and-y-with-floornx-y3711/0/"> <div class="problems-list-menu__navbar-body-list__item">Sum of product of x and y with floor(n/x) = y</div><i class=" pull-right far fa-circle" style="color:#fff;"></i></a> </li><li> <a href="https://practice.geeksforgeeks.org/problems/decode-the-pattern1138/0/"> <div class="problems-list-menu__navbar-body-list__item">Look and Say Pattern</div><i class=" pull-right far fa-circle" style="color:#fff;"></i></a> </li><li> <a href="https://practice.geeksforgeeks.org/problems/253524a82f7b4561dc33ff637cd3b92c33d4f216/0/"> <div class="problems-list-menu__navbar-body-list__item">Find rectangle with corners as 1</div><i class=" pull-right far fa-circle" style="color:#fff;"></i></a> </li><li> <a href="https://practice.geeksforgeeks.org/problems/remove-bst-keys-outside-given-range/0/"> <div class="problems-list-menu__navbar-body-list__item">Remove BST keys outside given range</div><i class=" pull-right far fa-circle" style="color:#fff;"></i></a> </li><li> <a href="https://practice.geeksforgeeks.org/problems/reverse-bits-1611130171/0/"> <div class="problems-list-menu__navbar-body-list__item">Reverse Bits</div><i class=" pull-right far fa-circle" style="color:#fff;"></i></a> </li><li> <a href="https://practice.geeksforgeeks.org/problems/c-array-print-an-element-set-25933/0/"> <div class="problems-list-menu__navbar-body-list__item">C++ Array (print an element) | Set 2</div><i class=" pull-right far fa-circle" style="color:#fff;"></i></a> </li><li> <a href="https://practice.geeksforgeeks.org/problems/play-with-or5515/0/"> <div class="problems-list-menu__navbar-body-list__item">Play With OR</div><i class=" pull-right far fa-circle" style="color:#fff;"></i></a> </li><li> <a href="https://practice.geeksforgeeks.org/problems/queue-using-stack/0/"> <div class="problems-list-menu__navbar-body-list__item">Queue using stack</div><i class=" pull-right far fa-circle" style="color:#fff;"></i></a> </li><li> <a href="https://practice.geeksforgeeks.org/problems/game-with-nos3123/0/"> <div class="problems-list-menu__navbar-body-list__item">Game with nos</div><i class=" pull-right far fa-circle" style="color:#fff;"></i></a> </li><li> <a href="https://practice.geeksforgeeks.org/problems/sort-the-string-in-descending-order3542/0/"> <div class="problems-list-menu__navbar-body-list__item">Sort the string in descending order</div><i class=" pull-right far fa-circle" style="color:#fff;"></i></a> </li><li> <a href="https://practice.geeksforgeeks.org/problems/easy-query3301/0/"> <div class="problems-list-menu__navbar-body-list__item">Easy Query</div><i class=" pull-right far fa-circle" style="color:#fff;"></i></a> </li><li> <a href="https://practice.geeksforgeeks.org/problems/largest-value-in-each-level/0/"> <div class="problems-list-menu__navbar-body-list__item">Largest value in each level</div><i class=" pull-right far fa-circle" style="color:#fff;"></i></a> </li><li> <a href="https://practice.geeksforgeeks.org/problems/swap-two-numbers3844/0/"> <div class="problems-list-menu__navbar-body-list__item">Swap two numbers</div><i class=" pull-right far fa-circle" style="color:#fff;"></i></a> </li><li> <a href="https://practice.geeksforgeeks.org/problems/flip-the-matrix/0/"> <div class="problems-list-menu__navbar-body-list__item">Flip the Matrix</div><i class=" pull-right far fa-circle" style="color:#fff;"></i></a> </li><li> <a href="https://practice.geeksforgeeks.org/problems/number-of-palindromic-paths-in-a-matrix0819/0/"> <div class="problems-list-menu__navbar-body-list__item">Number of Palindromic paths in a Matrix</div><i class=" pull-right far fa-circle" style="color:#fff;"></i></a> </li></ul></div>
                </div>
                <div class="panel-footer problems-list-menu__navbar-footer">
                                                    
                </div>
              </div>
            <!-- </div> -->
        <!-- </div> -->
</div>
            <!-- </div> -->

    <div class="problem-leaderboard-bg col-sm-8 col-lg-9 hidden-xs" style="min-height: unset;">
    </div>
    <div class="problem-leaderboard-menu col-xs-12 col-sm-4 col-lg-3">
        <a class="leaderboard-close"><img src="./Add1 to a number represented as linked list_files/leaderboard-close-1605114329.svg" width="20" height="20"></a>

                <link href="./Add1 to a number represented as linked list_files/leaderboardPage.css" rel="stylesheet" type="text/css">

        <!-- LeaderBoard  -->
        <div class="col-sm-12">
            <!-- LeaderBoard Title -->
            <div class="leaderboard-title">
                Leaderboard
            </div>
        </div>
            
        <div class="col-sm-12">
            <div class="showingLabel">Showing: </div>

            <div class="dropdown btn-group">
                <select id="rankingType" style="color: #2f8d46;font-weight: bolder;margin: 5px 0 0 5px;">
                    <option selected="selected">Overall Ranking</option>
                    <option>Monthly Ranking</option>
                </select>
            </div>
        </div>
        <div class="col-sm-12" style="margin: 2rem 0 6rem 0;">
            <!-- Leaderboard Table -->
            <table class="table table-hover" id="leaderboardTable">
                <tbody id="overall">
                <tr>
                    <th><span>
                            <img src="./Add1 to a number represented as linked list_files/leaderboard-username-1603188946.svg">
                            Handle
                        </span>
                    </th>
                    <th><span>
                            <img src="./Add1 to a number represented as linked list_files/leaderboard-points-1603188919.svg">
                            Score 
                        </span>
                    </th>
                </tr>
                                    <tr>
                        <td class="loggedinUser"><a href="https://auth.geeksforgeeks.org/user/mdwasif7894/practice/">@mdwasif7894</a></td>
                        <td class="loggedinUser userScore">348</td>
                    </tr>
                                        <tr>
                        <td><a href="https://auth.geeksforgeeks.org/user/Ibrahim%20Nash/practice/">@Ibrahim Nash</a></td>
                        <td>6381</td>
                    </tr>
                                        <tr>
                        <td><a href="https://auth.geeksforgeeks.org/user/blackshadows/practice/">@blackshadows</a></td>
                        <td>6329</td>
                    </tr>
                                        <tr>
                        <td><a href="https://auth.geeksforgeeks.org/user/mb1973/practice/">@mb1973</a></td>
                        <td>5435</td>
                    </tr>
                                        <tr>
                        <td><a href="https://auth.geeksforgeeks.org/user/Quandray/practice/">@Quandray</a></td>
                        <td>5231</td>
                    </tr>
                                        <tr>
                        <td><a href="https://auth.geeksforgeeks.org/user/akhayrutdinov/practice/">@akhayrutdinov</a></td>
                        <td>5111</td>
                    </tr>
                                        <tr>
                        <td><a href="https://auth.geeksforgeeks.org/user/saiujwal13083/practice/">@saiujwal13083</a></td>
                        <td>4510</td>
                    </tr>
                                        <tr>
                        <td><a href="https://auth.geeksforgeeks.org/user/sanjay05/practice/">@sanjay05</a></td>
                        <td>3762</td>
                    </tr>
                                        <tr>
                        <td><a href="https://auth.geeksforgeeks.org/user/marius_valentin_dragoi/practice/">@marius_valentin_dragoi</a></td>
                        <td>3522</td>
                    </tr>
                                        <tr>
                        <td><a href="https://auth.geeksforgeeks.org/user/sushant_a/practice/">@sushant_a</a></td>
                        <td>3459</td>
                    </tr>
                                        <tr>
                        <td><a href="https://auth.geeksforgeeks.org/user/verma_ji/practice/">@verma_ji</a></td>
                        <td>3386</td>
                    </tr>
                                        <tr>
                        <td><a href="https://auth.geeksforgeeks.org/user/KshamaGupta/practice/">@KshamaGupta</a></td>
                        <td>3318</td>
                    </tr>
                                
                <tr style="cursor:pointer;" onclick="window.location=&#39;/leaderboard/&#39;;">
                    <td class="completeLeaderboard" colspan="2">Complete Leaderboard</td>
                </tr>
                </tbody>
                <tbody id="monthly" style="display:none;">
                <tr>
                    <th><span>
                            <img src="./Add1 to a number represented as linked list_files/leaderboard-username-1603188946.svg">
                            Handle
                        </span>
                    </th>
                    <th><span>
                            <img src="./Add1 to a number represented as linked list_files/leaderboard-points-1603188919.svg">
                            Score 
                        </span>
                    </th>
                </tr>
                                    <tr>
                        <td class="loggedinUser"><a href="https://auth.geeksforgeeks.org/user/mdwasif7894/practice/">@mdwasif7894</a></td>
                        <td class="loggedinUser userMonthlyScore">348</td>
                    </tr>
                                        <tr>
                        <td><a href="https://auth.geeksforgeeks.org/user/terabaap123/practice/">@terabaap123</a></td>
                        <td>784</td>
                    </tr>
                                        <tr>
                        <td><a href="https://auth.geeksforgeeks.org/user/1905439/practice/">@1905439</a></td>
                        <td>579</td>
                    </tr>
                                        <tr>
                        <td><a href="https://auth.geeksforgeeks.org/user/vs102019/practice/">@vs102019</a></td>
                        <td>539</td>
                    </tr>
                                        <tr>
                        <td><a href="https://auth.geeksforgeeks.org/user/agrawalarchana2015/practice/">@agrawalarchana2015</a></td>
                        <td>504</td>
                    </tr>
                                        <tr>
                        <td><a href="https://auth.geeksforgeeks.org/user/mail2abhinandan01/practice/">@mail2abhinandan01</a></td>
                        <td>494</td>
                    </tr>
                                        <tr>
                        <td><a href="https://auth.geeksforgeeks.org/user/sharmachandan487/practice/">@sharmachandan487</a></td>
                        <td>404</td>
                    </tr>
                                        <tr>
                        <td><a href="https://auth.geeksforgeeks.org/user/shubhamkhullar7/practice/">@shubhamkhullar7</a></td>
                        <td>383</td>
                    </tr>
                                        <tr>
                        <td><a href="https://auth.geeksforgeeks.org/user/RizulBansal/practice/">@RizulBansal</a></td>
                        <td>380</td>
                    </tr>
                                        <tr>
                        <td><a href="https://auth.geeksforgeeks.org/user/smitadiwedi1991/practice/">@smitadiwedi1991</a></td>
                        <td>368</td>
                    </tr>
                                        <tr>
                        <td><a href="https://auth.geeksforgeeks.org/user/gupta_10/practice/">@gupta_10</a></td>
                        <td>358</td>
                    </tr>
                                        <tr>
                        <td><a href="https://auth.geeksforgeeks.org/user/zeekgeek/practice/">@zeekgeek</a></td>
                        <td>348</td>
                    </tr>
                                
                <tr style="cursor:pointer;" onclick="window.location=&#39;/leaderboard/&#39;;">
                    <td class="loggedinUser" colspan="2">Complete Leaderboard</td>
                </tr>
                </tbody>
            </table>
        </div>
    </div>
    <style>
        .leaderboard-close {
            border-radius: 50%;
            padding: 10px;
            background: #e9eaef;
            position: absolute;
            top: 10px;
            right: 10px;
            cursor: pointer;
            z-index: 1100;
        }
        .leaderboard-title {
            margin-left: unset !important;
            font-size: 2rem !important;
            font-weight: 700 !important;
        }

        .showingLabel {
            margin-left: unset !important;
            margin-top: 1.3rem !important;
            font-size: 1.5rem !important;
        }

        #filterDropDownButton {
            font-size: 1.5rem !important;
        }
    </style>
    <script>
        $("#rankingType").val("Overall Ranking");
        $('#rankingType').on('change', function() {
            $("#overall").toggle();
            $("#monthly").toggle();
        });
    </script>

<div class="problem-container">
    <div class="leftSide" style="width: 564px;">
        <div class="container-left">
    <ul class="nav nav-tabs problem-menu-tabs">
        <li class="active nav-tabs__problem">
            <a data-toggle="tab" href="https://practice.geeksforgeeks.org/problems/add-1-to-a-number-represented-as-linked-list/1#problems"><span class="problem-icon"></span>Problem</a>
        </li>
                    <li><a data-toggle="tab" href="https://practice.geeksforgeeks.org/problems/add-1-to-a-number-represented-as-linked-list/1#editorial"> <span class="editorial-icon"></span> Editorial</a></li>
          
        <li class="nav-tabs__my-submissions"><a data-toggle="tab" href="https://practice.geeksforgeeks.org/problems/add-1-to-a-number-represented-as-linked-list/1#submission"> <span class="submission-icon"></span> Submissions </a></li>
        <li class="nav-tabs__discussion"><a data-toggle="tab" href="https://practice.geeksforgeeks.org/problems/add-1-to-a-number-represented-as-linked-list/1#discussion"> <span class="doubt-icon"></span>Doubt Support </a></li>
    </ul>
    <div class="tab-content problem-menu-content">
        <div id="problems" class="tab-pane fade in active problem-tab">
            <div class="problem-intro">
                <div class="row problem-intro__row">
                    <span class="problem-tab__name"> 
                        Add 1 to a number represented as linked list 
                        
                    </span>
                    <span class="problem-tab__bookmark">
                                            <a href="https://practice.geeksforgeeks.org/problems/add-1-to-a-number-represented-as-linked-list/1#" class=""> <i id="bookmarkIcon" class="far fa-bookmark add-bookmark" aria-hidden="true" data-toggle="tooltip" title="" data-original-title="Add Bookmark"></i> </a>
                          
                    </span>
                      
                </div>
                <div class="row problem-meta-summary">
                    <strong class="problem-tab__problem-level"> Easy </strong>
                    <span class="problem-tab__problem-accuracy"> <span class="problem-tab__key">Accuracy:</span> <span class="problem-tab__value"> 51.33% </span> </span>
                    <span class="problem-tab__problem-total-submissions"> <span class="problem-tab__key"> Submissions:</span> <span class="problem-tab__value"> 31275 </span> </span>
                    <span class="problem-tab__problem-points"> <span class="problem-tab__key"> Points:</span> <span class="problem-tab__value"> 2 </span> </span>
                </div>
                <hr style="margin-top: 10px;">
            </div>  
            <div class="problem-statement">
                <p></p><p><span style="font-size:18px">A number&nbsp;<strong>N</strong>&nbsp;is represented in Linked List such that each digit corresponds to a node in linked list. You need to add 1 to it.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>LinkedList: 4-&gt;5-&gt;6
<strong>Output: </strong>457&nbsp;</span>
</pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>LinkedList: 1-&gt;2-&gt;3
<strong>Output: </strong>124&nbsp;</span></pre>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
Your task is to complete the function addOne() which takes the head of the linked list as the only argument and returns the head of the modified linked list. The driver code prints the number.<br>
<strong>Note:&nbsp;</strong>The head represents the left-most digit of the number.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:&nbsp;</strong>O(N).<br>
<strong>Expected Auxiliary Space:&nbsp;</strong>O(1).</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 &lt;= N &lt;= 10<sup>1000</sup></span></p>
 <p></p>
            </div>
                        
            <div class="panel-group problem-metainfo-group" id="problemMetaInfo">
                  
                <div class="panel metainfo-panel-close shadow-lg">
                    <div class="panel-heading">
                        <strong class="panel-title">
                            <a data-toggle="collapse" href="https://practice.geeksforgeeks.org/problems/add-1-to-a-number-represented-as-linked-list/1#companyTags"> <strong class="panel-title__text">Company Tags</strong> <span class="pull-right"> <i class="fas fa-angle-down circle-icon rotate" aria-hidden="true"></i> </span> </a> 
                        </strong>
                    </div>
                    <div id="companyTags" class="panel-collapse collapse">
                        <div class="panel-body">
                        <a class="problem-tag" href="https://practice.geeksforgeeks.org/explore/?company[]=Amazon" target="_blank"> <i class="far fa-circle"></i>  <span>Amazon </span> </a>                        </div>
                    </div>
                </div>
                
                                <div class="panel metainfo-panel-close shadow-lg">
                    <div class="panel-heading">
                        <strong class="panel-title"> 
                            <a data-toggle="collapse" href="https://practice.geeksforgeeks.org/problems/add-1-to-a-number-represented-as-linked-list/1#topicTags"> <strong class="panel-title__text"> Topic Tags </strong> <span class="pull-right"> <i class="fas fa-angle-down  circle-icon rotate" aria-hidden="true"></i> </span>  </a>
                        </strong>
                    </div>
                    <div id="topicTags" class="panel-collapse collapse">
                        <div class="panel-body">
                        <a class="problem-tag" href="https://practice.geeksforgeeks.org/explore/?category[]=Linked%20List" target="_blank"> <i class="far fa-circle"></i>  <span>Linked List </span> </a>                        </div>
                    </div>
                </div>
                
                
                            </div>
        
            <div id="tab-content__problems__disqus">
                <div class="col-sm-12 text-center">
                    <button id="loadDiscussionBtn" class="btn text-center" type="button"> <img src="./Add1 to a number represented as linked list_files/gfg-practice-discussion-icon-v1.svg"> Load Comments</button>
                </div>
                <div class="row gfg-disqus-container">
                    <div class="col-sm-12 col-xs-12" style="margin-top: 10px;">
                        <div id="disqus_thread"><iframe id="dsq-app121" name="dsq-app121" allowtransparency="true" frameborder="0" scrolling="no" tabindex="0" title="Disqus" width="100%" src="./Add1 to a number represented as linked list_files/saved_resource(2).html" style="width: 1px !important; min-width: 100% !important; border: none !important; overflow: hidden !important; height: 0px !important; max-width: 100%;" horizontalscrolling="no" verticalscrolling="no"></iframe><iframe id="indicator-north" name="indicator-north" allowtransparency="true" frameborder="0" scrolling="no" tabindex="0" title="Disqus" style="width: 0px !important; border: none !important; overflow: hidden !important; top: 0px !important; min-width: 0px !important; max-width: 100%; position: fixed !important; z-index: 2147483646 !important; height: 0px !important; min-height: 0px !important; max-height: 0px !important; display: none !important;" src="./Add1 to a number represented as linked list_files/saved_resource(3).html"></iframe><iframe id="indicator-south" name="indicator-south" allowtransparency="true" frameborder="0" scrolling="no" tabindex="0" title="Disqus" style="width: 0px !important; border: none !important; overflow: hidden !important; bottom: 0px !important; min-width: 0px !important; max-width: 100%; position: fixed !important; z-index: 2147483646 !important; height: 0px !important; min-height: 0px !important; max-height: 0px !important; display: none !important;" src="./Add1 to a number represented as linked list_files/saved_resource(4).html"></iframe></div>
                        <script>
                        /**
                           *  RECOMMENDED CONFIGURATION VARIABLES: EDIT AND UNCOMMENT THE SECTION BELOW TO INSERT DYNAMIC VALUES FROM YOUR PLATFORM OR CMS.
                           *  LEARN WHY DEFINING THESE VARIABLES IS IMPORTANT: https://disqus.com/admin/universalcode/#configuration-variables
                           */
                          
                          var disqus_config = function () {
                              this.page.url = 'https://practice.geeksforgeeks.org/problem-page.php?pid=700053';  // Replace PAGE_URL with your page's canonical URL variable
                              this.page.identifier = 'problem-page.php?pid=700053'; // Replace PAGE_IDENTIFIER with your page's unique identifier variable
                              this.callbacks.onNewComment = [function(comment) { 
                                  var author = 'vaibhav2992';
                                  var problem ='Add 1 to a number represented as linked list'; 
                                  var requestType = 'notifyProblemAuthor';
                                  var problemLink = window.location.href;
                                  var sendMail = '';  // don't send mail if problem is older than a month
                                  if(sendMail) {
                                      $.ajax({
                                        type:"POST",
                                        url:"/ajax/monitorDisqusAjax.php",
                                        data: {requestType: requestType, author: author, problemLink: problemLink, problem: problem, comment: comment},
                                        dataType: "json",
                                      });
                                  }
                              }];
                          };
                         </script>
                        <noscript>Please enable JavaScript to view the <a href="https://disqus.com/?ref_noscript" rel="nofollow">comments powered by Disqus.</a></noscript>
                    </div>
                </div>
            </div>
            <div class="text-center" style="margin-top: 50px;">
    <button id="reportIssueBtn" type="button" class="btn btn-sm" style="font-size:12px;border-radius:0.3rem;" data-target="#reportIssue" data-toggle="modal" utoken="e3cd26ac30d97c795aeb24d5dd2ed0617aecec6631363135383030303233"><i class="fa fa-bug" aria-hidden="true"></i> Report An Issue</button>
    <br><small>If you are facing any issue on this page. Please let us know.</small>
</div><br>
 
        </div>
        <div id="editorial" class="tab-pane fade">
            <div id="problemEditorials">
                <h3>Editorial</h3>
                <p>We strongly recommend solving this problem on your own before viewing its editorial. Do you still want to view the editorial?</p>
                <a class="btn btn-success btn-round" id="viewEditorial"> Yes </a>
            </div>
        </div>
        <div id="submission" class="tab-pane fade">
            <div id="mySubmissions">
                <div class="row">
                    <h4 style="padding:10px;"> <a class="btn pull-right" target="_blank" href="https://practice.geeksforgeeks.org/problem_submissions.php?pid=700053"> All Submissions </a> </h4>
                    <h4 style="padding:5px;border-bottom:2px solid #c2b9b9;"> My Submissions:</h4>
                                            <small style="cursor:pointer; padding:10px;" class="pull-right" id="latestSubmission"> <span id="latestSubmissionIcon"> <i class="fa fa-refresh" aria-hidden="true"></i> </span> Refresh </small>

                        <div class="my-submissions-list to-be-fetched col-sm-12">
                            <h4 class="text-center"><i class="fa fa-spinner fa-pulse fa-4x"></i> </h4>
                        </div>
                          
                </div>
            </div>
        </div>
        <div id="discussion" class="tab-pane fade">
            <div class="row">
                <div id="forum-discussion-container" class="col-md-8 col-md-offset-2">
                    <span class="discussion-problem-name">
                        Add 1 to a number represented as linked list                    </span>
                    <div id="forum-discussion">
    <section id="comments">
        <div class="forum--header">
            <div class="forum--search"><input type="text" class="form-control search_content" placeholder="Search doubts, discussions or users"><a class="search--icon discussion-search-locked" data-toggle="modal" data-target="#premium-modal"><img src="./Add1 to a number represented as linked list_files/doubt_search-1599568245.svg"></a></div>
            
            <a class="ask-doubt locked" data-toggle="modal" data-target="#premium-modal"><img src="./Add1 to a number represented as linked list_files/doubt-lock-white-1600291009.svg"> Ask Doubt</a>
        </div>    
        <span class="doubt-message">**Our experts will be available from 10 AM to 1 AM (IST)</span>
        <div class="modal fade" id="discussion-forum" tabindex="-1" role="dialog" aria-hidden="true" aria-labelledby="discussion-forum">
            <div class="modal-dialog">
                <div class="modal-content" style="border-radius:0px">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">×</span><span class="sr-only">Close</span></button>
                        <h4 class="modal-title">Ask / Start a new Discussion</h4>
                    </div>
                    <div class="modal-body">
                        <div class="form-group">
                            <input class="form-control input-sm" id="discussion-title" maxlength="200" name="title" placeholder="Title" type="text" value="" required="">
                        </div>
                        <div class="form-group">
                           <textarea class="form-control" cols="20" id="discussion-text" maxlength="2000" name="forum" placeholder="Description" rows="4" required=""></textarea>
                        </div>
                    </div>
                    <div class="modal-footer">
                        <div class="clearfix">
                            <div class="pull-right">
                                <a id="btnPostDiscussion" class="btn discussion-submit">Submit</a>
                                <input type="hidden" id="ctoken" value="fb9b691c5908397bbe11f810dff6e5aa628e471640b23cb882a79ff43a601a52">
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="modal fade" id="premium-modal" tabindex="-1" role="dialog" aria-hidden="true" aria-labelledby="premium-modal">
            <div class="modal-dialog">
                <div class="modal-content" style="border-radius:0px">
                    <div class="modal-body">
                        <button type="button" class="close" data-dismiss="modal" style="padding: 0 5px;position: absolute;right: 1.5rem"><span aria-hidden="true">×</span><span class="sr-only">Close</span></button>
                        <img class="img-responsive" src="./Add1 to a number represented as linked list_files/doubt-non-premium-1600415643.png">
                        <a href="https://premium.geeksforgeeks.org/premium-plans/" class="btn premium-plans">View Premium Plans</a>
                    </div>
                </div>
            </div>
        </div>
        <div id="discussion-feed">
            <img class="img-responsive no-doubt" src="./Add1 to a number represented as linked list_files/no-doubts-1600195168.png">
        </div>
        <div class="row text-center"></div>
    <section>
        </section></section></div>
                </div>
                
                <!-- add this button if full access is true to enable the chat button
                 <button class="btn chat_button">
                    <img class="live-chat-icon" src="https://media.geeksforgeeks.org/img-practice/headphones-1604913204.svg" />
                    <img class="live-chat-close-icon" src="https://media.geeksforgeeks.org/img-practice/cross-1604913181.svg" style="display: none;" />
                </button> -->
            </div>
            <script defer="" type="text/javascript" src="./Add1 to a number represented as linked list_files/MathJax.js.download"></script>
            <script defer="" type="text/javascript" src="./Add1 to a number represented as linked list_files/bootstrap-ckeditor.js.download"></script>
            <script defer="" src="./Add1 to a number represented as linked list_files/ckeditor.js.download"></script>
            <script defer="" src="./Add1 to a number represented as linked list_files/jquery.js.download"></script>
            <script id="forum-script" type="text/javascript" async="" src="./Add1 to a number represented as linked list_files/discussionForum.js.download"></script><script defer="" type="text/javascript" id="forum-embeder" class="async-script-loader">
              (function() {
                  var forumDiv = $("#forum-discussion");
                  if( forumDiv.size() > 0 ) {
                      var forumLoaded = false,
                      top = forumDiv.offset().top, // from where to start loading
                      check = function() {
                              if( !forumLoaded) {
                                  forumLoaded = true;

                                  (function asyncLoad() {
                                      var s = document.createElement('script');
                                      s.id = "forum-script"
                                      s.type = 'text/javascript';
                                      s.async = true;
                                      var theUrl = 'https://cdnpractice.geeksforgeeks.org/js-min/discussionForum.js?v=7.4';
                                      theUrl = theUrl + ( theUrl.indexOf("?") >= 0 ? "&" : "?" ) + 'itemId=' + '700053'; //unique slug and discussion type
                                      theUrl = theUrl + ( theUrl.indexOf("?") >= 0 ? "&" : "?" ) + 'type=' + 'problems';
                                      theUrl = theUrl + ( theUrl.indexOf("?") >= 0 ? "&" : "?" ) + 'doubtAssistance=' + '0';
                                      s.src = theUrl;
                                      var embedder = document.getElementById('forum-embeder');
                                      embedder.parentNode.insertBefore(s, embedder);
                                  })();
                              }
                      };
                      $( document ).ready(function() {
                        check();                  
                      });
                  }
              })();
            </script>
        </div>
    </div>

    <div id="outputBlock" style="display: none;"> 
        <div class="outputBlock-header">
            <div class="outputBlock-header-title"><h4>Output Window</h4></div>
            <div class="outputBlock-header-icons pull-right">
                <a class="output-maximize" href="https://practice.geeksforgeeks.org/problems/add-1-to-a-number-represented-as-linked-list/1#" style=""><img src="./Add1 to a number represented as linked list_files/maximize-1603058844.svg"></a>
                <a class="output-minimize" href="https://practice.geeksforgeeks.org/problems/add-1-to-a-number-represented-as-linked-list/1#" style="display: none;"><img src="./Add1 to a number represented as linked list_files/minimize-1603060113.svg"></a>
                <a class="output-modal-open" href="https://practice.geeksforgeeks.org/problems/add-1-to-a-number-represented-as-linked-list/1#"><img src="./Add1 to a number represented as linked list_files/enter_modal-1603060983.svg"></a>
                <a class="output-modal-close" href="https://practice.geeksforgeeks.org/problems/add-1-to-a-number-represented-as-linked-list/1#" style="display:none;"><img src="./Add1 to a number represented as linked list_files/exit_modal-1603061157.svg"></a>
                <a class="output-close" href="https://practice.geeksforgeeks.org/problems/add-1-to-a-number-represented-as-linked-list/1#" data-dismiss="modal"><img src="./Add1 to a number represented as linked list_files/output_window_close-1603060405.svg"></a>
            </div>
        </div>
        <div class="out" style="display: none;">
            <pre>Correct Answer.<img style="position: relative; top: 2px; left: 5px; height: 27px; margin-right:10px;" src="./Add1 to a number represented as linked list_files/right.png" border="0" title="Correct Answer" alt="Correct Answer"><br>Execution Time:0.57<br></pre>
        </div>
    </div>

    <div class="modal fade" id="outputModal">
        <div class="modal-dialog ">
            <div class="modal-content outputModal-content" style="max-height:80vh; overflow-y:auto"> 
        <div class="outputBlock-header">
            <div class="outputBlock-header-title"><h4>Output Window</h4></div>
            <div class="outputBlock-header-icons pull-right">
                <a class="output-maximize" href="https://practice.geeksforgeeks.org/problems/add-1-to-a-number-represented-as-linked-list/1#" style=""><img src="./Add1 to a number represented as linked list_files/maximize-1603058844.svg"></a>
                <a class="output-minimize" href="https://practice.geeksforgeeks.org/problems/add-1-to-a-number-represented-as-linked-list/1#" style="display: none;"><img src="./Add1 to a number represented as linked list_files/minimize-1603060113.svg"></a>
                <a class="output-modal-open" href="https://practice.geeksforgeeks.org/problems/add-1-to-a-number-represented-as-linked-list/1#"><img src="./Add1 to a number represented as linked list_files/enter_modal-1603060983.svg"></a>
                <a class="output-modal-close" href="https://practice.geeksforgeeks.org/problems/add-1-to-a-number-represented-as-linked-list/1#" style="display:none;"><img src="./Add1 to a number represented as linked list_files/exit_modal-1603061157.svg"></a>
                <a class="output-close" href="https://practice.geeksforgeeks.org/problems/add-1-to-a-number-represented-as-linked-list/1#" data-dismiss="modal"><img src="./Add1 to a number represented as linked list_files/output_window_close-1603060405.svg"></a>
            </div>
        </div>
        <div class="out" style="display: none;">
            <pre>Correct Answer.<img style="position: relative; top: 2px; left: 5px; height: 27px; margin-right:10px;" src="./Add1 to a number represented as linked list_files/right.png" border="0" title="Correct Answer" alt="Correct Answer"><br>Execution Time:0.57<br></pre>
        </div>
    </div>
        </div>
    </div>

</div>
    </div>
        <div class="slider">
                <img src="./Add1 to a number represented as linked list_files/slider-icon-1605160260.svg" style="width: 5px">
        </div>
    <div class="editor-mobile" style="width: 972px;">
        
    <div class="container-right">
        <div id="sampleTestCases" style="display:none">456</div>
        <div class="header-editor">
            <div class="left-div">
                <div class="btn-group bootstrap-select"><button type="button" class="btn dropdown-toggle btn-default" data-toggle="dropdown" role="button" data-id="languageDropdown" title="Java (1.8)"><span class="filter-option pull-left">Java (1.8)</span>&nbsp;<span class="bs-caret"><span class="caret"></span></span></button><div class="dropdown-menu open" role="combobox"><ul class="dropdown-menu inner" role="listbox" aria-expanded="false"><li data-original-index="0" class=""><a tabindex="0" class="" data-tokens="null" role="option" aria-disabled="false" aria-selected="false"><span class="text">C++ (g++ 5.4)</span><span class="glyphicon glyphicon-ok check-mark"></span></a></li><li data-original-index="1" class="selected"><a tabindex="0" class="" data-tokens="null" role="option" aria-disabled="false" aria-selected="true"><span class="text">Java (1.8)</span><span class="glyphicon glyphicon-ok check-mark"></span></a></li><li data-original-index="2"><a tabindex="0" class="" data-tokens="null" role="option" aria-disabled="false" aria-selected="false"><span class="text">Python3</span><span class="glyphicon glyphicon-ok check-mark"></span></a></li><li data-original-index="3"><a tabindex="0" class="" data-tokens="null" role="option" aria-disabled="false" aria-selected="false"><span class="text">Javascript (Node v12.19.0)</span><span class="glyphicon glyphicon-ok check-mark"></span></a></li></ul></div><select id="languageDropdown" class="selectpicker" tabindex="-98">
                                            <option value="cpp">C++ (g++ 5.4)</option>
                                            <option value="java">Java (1.8)</option>
                                            <option value="python3">Python3</option>
                                            <option value="javascript">Javascript (Node v12.19.0)</option>
                                    </select></div>
            </div>
            <div class="center-div">
                <span>Test against custom input</span>
                <input type="checkbox" id="customInputCheckbox" class="switch-input">
                <label for="customInputCheckbox" class="switch-label"></label>
            </div>
            <div class="right-div">
                <a id="darkTheme" title="Dark Theme" style="display:none;">
                    <img src="./Add1 to a number represented as linked list_files/dark-1600972274.svg">
                </a>
                <a id="lightTheme" title="Light Theme" style="">
                    <img src="./Add1 to a number represented as linked list_files/light-1600972290.svg">
                </a>
                                <a id="resetEditor" title="Reset Code">
                    <img src="./Add1 to a number represented as linked list_files/reset_code-1600545606.svg">
                </a>
                <a id="zoom" title="Editor FullScreen" href="javascript:void(0)">
                    <img src="./Add1 to a number represented as linked list_files/full_screen-1600545500.svg">
                </a>
            </div>
        </div>


        <div id="editor" class="editor editor-block ace_editor ace-dracula ace_dark"><textarea class="ace_text-input" wrap="off" autocorrect="off" autocapitalize="off" spellcheck="false" style="opacity: 0; font-size: 1px; height: 1px; width: 1px; top: 303px; left: 275px;"></textarea><div class="ace_gutter" aria-hidden="true" style="left: 0px; width: 60px;"><div class="ace_layer ace_gutter-layer ace_folding-enabled" style="height: 1e+06px; top: -699px; left: 0px; width: 60px;"><div class="ace_gutter-cell " style="height: 18.9062px; top: 680.625px;">82<span style="display: none; height: 18.9062px;" class="ace_fold-widget ace_start ace_open"></span></div><div class="ace_gutter-cell " style="height: 18.9062px; top: 699.531px;">83<span class="ace_fold-widget ace_start ace_open" style="display: none; height: 18.9062px;"></span></div><div class="ace_gutter-cell " style="height: 18.9062px; top: 718.438px;">84<span style="display: none; height: 18.9062px;" class="ace_fold-widget ace_start ace_open"></span></div><div class="ace_gutter-cell " style="height: 18.9062px; top: 737.344px;">85<span style="display: none; height: 18.9062px;" class="ace_fold-widget ace_start ace_open"></span></div><div class="ace_gutter-cell " style="height: 18.9062px; top: 756.25px;">86<span class="ace_fold-widget ace_start ace_open" style="display: inline-block; height: 18.9062px;"></span></div><div class="ace_gutter-cell " style="height: 18.9062px; top: 775.156px;">87<span style="display: none; height: 18.9062px;" class="ace_fold-widget ace_start ace_open"></span></div><div class="ace_gutter-cell " style="height: 18.9062px; top: 794.062px;">88<span style="display: none; height: 18.9062px;" class="ace_fold-widget ace_start ace_open"></span></div><div class="ace_gutter-cell " style="height: 18.9062px; top: 812.969px;">89<span style="display: inline-block; height: 18.9062px;" class="ace_fold-widget ace_start ace_open"></span></div><div class="ace_gutter-cell " style="height: 18.9062px; top: 831.875px;">90<span style="display: none; height: 18.9062px;" class="ace_fold-widget ace_start ace_open"></span></div><div class="ace_gutter-cell " style="height: 18.9062px; top: 850.781px;">91<span style="display: none; height: 18.9062px;" class="ace_fold-widget ace_start ace_open"></span></div><div class="ace_gutter-cell " style="height: 18.9062px; top: 869.688px;">92<span style="display: none; height: 18.9062px;" class="ace_fold-widget ace_start ace_open"></span></div><div class="ace_gutter-cell " style="height: 18.9062px; top: 888.594px;">93<span style="display: none; height: 18.9062px;" class="ace_fold-widget ace_start ace_open"></span></div><div class="ace_gutter-cell " style="height: 18.9062px; top: 907.5px;">94<span style="display: inline-block; height: 18.9062px;" class="ace_fold-widget ace_start ace_open"></span></div><div class="ace_gutter-cell " style="height: 18.9062px; top: 926.406px;">95<span style="display: none; height: 18.9062px;" class="ace_fold-widget ace_start ace_open"></span></div><div class="ace_gutter-cell " style="height: 18.9062px; top: 945.312px;">96<span style="display: none; height: 18.9062px;" class="ace_fold-widget ace_start ace_open"></span></div><div class="ace_gutter-cell " style="height: 18.9062px; top: 964.219px;">97<span style="display: none; height: 18.9062px;" class="ace_fold-widget ace_start ace_open"></span></div><div class="ace_gutter-active-line ace_gutter-cell " style="height: 18.9062px; top: 983.125px;">98<span style="display: none; height: 18.9062px;" class="ace_fold-widget ace_start ace_open"></span></div><div class="ace_gutter-cell " style="height: 18.9062px; top: 1002.03px;">99<span style="display: none; height: 18.9062px;" class="ace_fold-widget ace_start ace_open"></span></div><div class="ace_gutter-cell " style="height: 18.9062px; top: 1020.94px;">100<span style="display: none; height: 18.9062px;" class="ace_fold-widget ace_start ace_open"></span></div><div class="ace_gutter-cell " style="height: 18.9062px; top: 1039.84px;">101<span style="display: none; height: 18.9062px;" class="ace_fold-widget ace_start ace_open"></span></div><div class="ace_gutter-cell " style="height: 18.9062px; top: 1058.75px;">102<span style="display: inline-block; height: 18.9062px;" class="ace_fold-widget ace_start ace_open"></span></div><div class="ace_gutter-cell " style="height: 18.9062px; top: 1077.66px;">103<span style="display: none; height: 18.9062px;" class="ace_fold-widget ace_start ace_open"></span></div><div class="ace_gutter-cell " style="height: 18.9062px; top: 1096.56px;">104<span class="ace_fold-widget ace_start ace_open" style="display: none; height: 18.9062px;"></span></div><div class="ace_gutter-cell " style="height: 18.9062px; top: 1115.47px;">105<span class="ace_fold-widget ace_start ace_open" style="display: none; height: 18.9062px;"></span></div><div class="ace_gutter-cell " style="height: 18.9062px; top: 1134.38px;">106<span style="display: none; height: 18.9062px;" class="ace_fold-widget ace_start ace_open"></span></div><div class="ace_gutter-cell " style="height: 18.9062px; top: 1153.28px;">107<span style="display: none; height: 18.9062px;" class="ace_fold-widget ace_start ace_closed"></span></div><div class="ace_gutter-cell " style="height: 18.9062px; top: 1172.19px;">108<span style="display: none; height: 18.9062px;" class="ace_fold-widget ace_start ace_open"></span></div></div></div><div class="ace_scroller" style="left: 60px; right: 7px; bottom: 0px;"><div class="ace_content" style="top: -18px; left: 0px; width: 808px; height: 493.812px;"><div class="ace_layer ace_print-margin-layer"><div class="ace_print-margin" style="left: 708px; visibility: hidden;"></div></div><div class="ace_layer ace_marker-layer"><div class="ace_active-line" style="height: 18.9062px; top: 302.5px; left: 0px; right: 0px;"></div></div><div class="ace_layer ace_text-layer" style="height: 1e+06px; margin: 0px 4px; top: -681px; left: 0px;"><div class="ace_line" style="height: 18.9062px; top: 680.625px;"><span class="ace_indent-guide">    </span>    <span class="ace_keyword">int</span> <span class="ace_identifier">carry</span> <span class="ace_keyword ace_operator">=</span> <span class="ace_constant ace_numeric">1</span>;</div><div class="ace_line" style="height: 18.9062px; top: 699.531px;"><span class="ace_indent-guide">    </span>    <span class="ace_identifier">Node</span> <span class="ace_identifier">curr</span> <span class="ace_keyword ace_operator">=</span> <span class="ace_identifier">revNode</span>;</div><div class="ace_line" style="height: 18.9062px; top: 718.438px;"><span class="ace_indent-guide">    </span>    <span class="ace_identifier">Node</span> <span class="ace_identifier">prev</span> <span class="ace_keyword ace_operator">=</span> <span class="ace_constant ace_language">null</span>;</div><div class="ace_line" style="height: 18.9062px; top: 737.344px;"><span class="ace_indent-guide">    </span>    <span class="ace_keyword">while</span>(<span class="ace_identifier">curr</span> <span class="ace_keyword ace_operator">!=</span> <span class="ace_constant ace_language">null</span>)</div><div class="ace_line" style="height: 18.9062px; top: 756.25px;"><span class="ace_indent-guide">    </span>    {</div><div class="ace_line" style="height: 18.9062px; top: 775.156px;"><span class="ace_indent-guide">    </span><span class="ace_indent-guide">    </span>    <span class="ace_keyword">int</span> <span class="ace_identifier">sum</span> <span class="ace_keyword ace_operator">=</span> <span class="ace_identifier">curr</span>.<span class="ace_identifier">data</span> <span class="ace_keyword ace_operator">+</span> <span class="ace_identifier">carry</span>;</div><div class="ace_line" style="height: 18.9062px; top: 794.062px;"><span class="ace_indent-guide">    </span><span class="ace_indent-guide">    </span>    <span class="ace_keyword">if</span>(<span class="ace_identifier">sum</span> <span class="ace_keyword ace_operator">&lt;</span> <span class="ace_constant ace_numeric">9</span>)</div><div class="ace_line" style="height: 18.9062px; top: 812.969px;"><span class="ace_indent-guide">    </span><span class="ace_indent-guide">    </span>    {</div><div class="ace_line" style="height: 18.9062px; top: 831.875px;"><span class="ace_indent-guide">    </span><span class="ace_indent-guide">    </span><span class="ace_indent-guide">    </span>    <span class="ace_identifier">curr</span>.<span class="ace_identifier">data</span> <span class="ace_keyword ace_operator">=</span> <span class="ace_identifier">curr</span>.<span class="ace_identifier">data</span> <span class="ace_keyword ace_operator">+</span> <span class="ace_identifier">carry</span>;</div><div class="ace_line" style="height: 18.9062px; top: 850.781px;"><span class="ace_indent-guide">    </span><span class="ace_indent-guide">    </span><span class="ace_indent-guide">    </span>    <span class="ace_keyword">return</span> <span class="ace_identifier">reverseList</span>(<span class="ace_identifier">revNode</span>);</div><div class="ace_line" style="height: 18.9062px; top: 869.688px;"><span class="ace_indent-guide">    </span><span class="ace_indent-guide">    </span>    }</div><div class="ace_line" style="height: 18.9062px; top: 888.594px;"><span class="ace_indent-guide">    </span><span class="ace_indent-guide">    </span>    <span class="ace_keyword">else</span></div><div class="ace_line" style="height: 18.9062px; top: 907.5px;"><span class="ace_indent-guide">    </span><span class="ace_indent-guide">    </span>    {</div><div class="ace_line" style="height: 18.9062px; top: 926.406px;"><span class="ace_indent-guide">    </span><span class="ace_indent-guide">    </span><span class="ace_indent-guide">    </span>    <span class="ace_identifier">curr</span>.<span class="ace_identifier">data</span> <span class="ace_keyword ace_operator">=</span> <span class="ace_identifier">sum</span> <span class="ace_keyword ace_operator">%</span> <span class="ace_constant ace_numeric">10</span>;</div><div class="ace_line" style="height: 18.9062px; top: 945.312px;"><span class="ace_indent-guide">    </span><span class="ace_indent-guide">    </span><span class="ace_indent-guide">    </span>    <span class="ace_identifier">carry</span> <span class="ace_keyword ace_operator">=</span> <span class="ace_identifier">sum</span> / <span class="ace_constant ace_numeric">10</span>; </div><div class="ace_line" style="height: 18.9062px; top: 964.219px;"><span class="ace_indent-guide">    </span><span class="ace_indent-guide">    </span>    }</div><div class="ace_line" style="height: 18.9062px; top: 983.125px;"><span class="ace_indent-guide">    </span><span class="ace_indent-guide">    </span>    <span class="ace_identifier">prev</span> <span class="ace_keyword ace_operator">=</span> <span class="ace_identifier">curr</span>;</div><div class="ace_line" style="height: 18.9062px; top: 1002.03px;"><span class="ace_indent-guide">    </span><span class="ace_indent-guide">    </span>    <span class="ace_identifier">curr</span> <span class="ace_keyword ace_operator">=</span> <span class="ace_identifier">curr</span>.<span class="ace_identifier">next</span>;</div><div class="ace_line" style="height: 18.9062px; top: 1020.94px;"><span class="ace_indent-guide">    </span>    }</div><div class="ace_line" style="height: 18.9062px; top: 1039.84px;"><span class="ace_indent-guide">    </span>    <span class="ace_keyword">if</span>(<span class="ace_identifier">carry</span> <span class="ace_keyword ace_operator">==</span> <span class="ace_constant ace_numeric">1</span>)</div><div class="ace_line" style="height: 18.9062px; top: 1058.75px;"><span class="ace_indent-guide">    </span>    {</div><div class="ace_line" style="height: 18.9062px; top: 1077.66px;"><span class="ace_indent-guide">    </span><span class="ace_indent-guide">    </span>    </div><div class="ace_line" style="height: 18.9062px; top: 1096.56px;"><span class="ace_indent-guide">    </span><span class="ace_indent-guide">    </span>    <span class="ace_identifier">Node</span> <span class="ace_identifier">dummy</span> <span class="ace_keyword ace_operator">=</span> <span class="ace_keyword">new</span> <span class="ace_identifier">Node</span>(<span class="ace_identifier">carry</span>);</div><div class="ace_line" style="height: 18.9062px; top: 1115.47px;"><span class="ace_indent-guide">    </span><span class="ace_indent-guide">    </span>    <span class="ace_identifier">prev</span>.<span class="ace_identifier">next</span> <span class="ace_keyword ace_operator">=</span> <span class="ace_identifier">dummy</span>;</div><div class="ace_line" style="height: 18.9062px; top: 1134.38px;"><span class="ace_indent-guide">    </span><span class="ace_indent-guide">    </span>    <span class="ace_keyword">return</span> <span class="ace_identifier">reverseList</span>(<span class="ace_identifier">revNode</span>);</div><div class="ace_line" style="height: 18.9062px; top: 1153.28px;"><span class="ace_indent-guide">    </span>    }</div></div><div class="ace_layer ace_marker-layer"></div><div class="ace_layer ace_cursor-layer ace_hidden-cursors"><div class="ace_cursor" style="display: block; top: 303px; left: 215px; width: 9px; height: 18.9062px; animation-duration: 1000ms;"></div></div></div></div><div class="ace_scrollbar ace_scrollbar-v" style="width: 12px; bottom: 0px;"><div class="ace_scrollbar-inner" style="width: 12px; height: 1247.81px;"></div></div><div class="ace_scrollbar ace_scrollbar-h" style="display: none; height: 12px; left: 60px; right: 7px;"><div class="ace_scrollbar-inner" style="height: 12px; width: 808px;"></div></div><div style="height: auto; width: auto; top: 0px; left: 0px; visibility: hidden; position: absolute; white-space: pre; font: inherit; overflow: hidden;"><div style="height: auto; width: auto; top: 0px; left: 0px; visibility: hidden; position: absolute; white-space: pre; font: inherit; overflow: visible;">הההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההה</div><div style="height: auto; width: auto; top: 0px; left: 0px; visibility: hidden; position: absolute; white-space: pre; font-style: inherit; font-variant: inherit; font-stretch: inherit; font-size: inherit; line-height: inherit; font-family: inherit; overflow: visible;">XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX</div></div></div>

        <div class="footer-editor" style="background: rgb(29, 30, 39);">
            <i id="ptoken" style="display:none">6b0c81339325be21a3fb57c6116c4e372c4f072cb2ccfa78770c93482b30471f</i>
            <div class="footer-timer" style="display: block;">
                <small>
                    <span class="material-icons timer-clock">alarm</span>
                    <span>Average Time: </span>
                    <span id="avgTime" style="color: rgb(255, 255, 255);">20m</span>
                </small>
                <div class="userTime" style="display: block;">
                    <span>Your Time: </span>
                    <span id="timeElapsed" style="color: rgb(255, 255, 255);">56m 55s</span>
                </div>
            </div>
            <div class="footer-right">
                                    <button id="show-hints" class="btn" title="Hints"><img src="./Add1 to a number represented as linked list_files/light-bulb-1596781614.svg"></button>
                                    <button id="testRun" class="btn"><img src="./Add1 to a number represented as linked list_files/play-1596780125.svg"> Compile &amp; Run</button>
                <button id="run" class="btn"><img src="./Add1 to a number represented as linked list_files/check-square-1596781127.svg"> Submit</button>
            </div>
        </div>
    </div>

    <div class="modal fade" id="customInputTestModal">
        <div class="modal-dialog ">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal">×</button>
                    <h4 class="modal-title">Enter Custom Input</h4>
                </div>
                <div class="modal-body">
                                            <p style="font-weight:bold">Input Format:</p>
                        <p></p><p>The first line contains an integer&nbsp;<strong>N. </strong>The driver code will convert it to linkedlist.</p>

<p><strong>Example :&nbsp;</strong></p>

<pre>456</pre>
<p></p>
                                        <textarea id="testArea" rows="4" style="width:100%;max-width:100%" maxlength="15000"></textarea><br><br>
                    <ul style="padding-left: 20px">
                        <li><b>Expected Output</b> - runs the test cases against the code of Online Judge.</li>
                        <li><b>My Output</b> - runs the test cases against your code.</li>
                    </ul>
                </div>
                <div class="modal-footer">
                    <button id="expectedRun" class="btn"><img src="./Add1 to a number represented as linked list_files/check-square-black-1601332644.svg"> Expected Output</button>
                    <button id="customInputTestRun" class="btn"><img src="./Add1 to a number represented as linked list_files/play-white-1601332700.svg"> My Output</button>
                </div>
            </div>
        </div>
    </div>

    <div class="modal fade" id="hintsModal">
        <div class="modal-dialog ">
            <div class="modal-content" style="max-height:90vh; overflow-y:auto">
                <div class="modal-body hints-modal-body" style="min-height:50vh; overflow-y:auto;">
                    <span class="fa fa-spin fa-spinner" style="top: 50%;left: 50%;transform: translate(50%);font-size: 30px;position: relative;"></span>
                </div>
                <div class="modal-footer">
                    <button class="btn btn-default" type="button" data-dismiss="modal">Close
                </button></div>
            </div>
        </div>
    </div>

    <script>
        var currentUser = 'mdwasif7894';
        var userHasAccessToApplyJob = true;  

        var sampleTestCases = $('#sampleTestCases').text();
        var track = '';
        var pid = "700053";
        var userid = "795900";
        var URLHOME = "https://practice.geeksforgeeks.org";
        var URLS3 = "https://media.geeksforgeeks.org/";
        var practiceApiHost = 'https://practiceapi.geeksforgeeks.org/api/v1/'; 
    </script>
    <link rel="stylesheet" href="./Add1 to a number represented as linked list_files/pretify.css" type="text/css">
    
    <script src="./Add1 to a number represented as linked list_files/ace.js.download" type="text/javascript" charset="utf-8"></script>
    <script src="./Add1 to a number represented as linked list_files/ext-language_tools.js.download"></script>
    <script src="./Add1 to a number represented as linked list_files/gfg-problems-right.js.download"></script>
        </div>
</div>
</div> <!--eo container-fluid --->




<script src="./Add1 to a number represented as linked list_files/gfg-problems.js.download"> </script>

<script src="./Add1 to a number represented as linked list_files/bootstrap-select.min.js(1).download"></script>
<script>
    window.urlCdn = "https://cdnpractice.geeksforgeeks.org";
    const videoFeedbackCodes = {"NO_VOTE":0,"LIKE":1,"DISLIKE":2,"ADD_FEEDBACK":3};
</script>
<!-- <script src="https://cdnpractice.geeksforgeeks.org/js-min/editorial.js?v=5.6"> </script> -->

<script src="./Add1 to a number represented as linked list_files/embed.js.download" async=""> </script>

<script src="./Add1 to a number represented as linked list_files/video.js.download"></script>
<link href="./Add1 to a number represented as linked list_files/video-js.css" rel="stylesheet">
<script src="./Add1 to a number represented as linked list_files/videojs-playbackrate-adjuster.min.js.download"></script>
<script src="./Add1 to a number represented as linked list_files/videojs-flash.min.js.download"></script>
<script src="./Add1 to a number represented as linked list_files/videojs-contrib-quality-levels.js.download"></script>
<script src="./Add1 to a number represented as linked list_files/videojs-hls-quality-selector.min.js.download"></script>
<script src="./Add1 to a number represented as linked list_files/videojs.hotkeys.min.js.download"></script>
<script src="./Add1 to a number represented as linked list_files/videoPlayer.js.download"></script>

<script>
    var videoToken = 'st=1615800023~exp=1615821623~acl=/*~hmac=723488d72eb1baffa3a68b3506dd3a48c6d4841925e63eed190df3b6563e066b';
 </script>
<div class="modal fade" id="gfgErrorModal" tabindex="-1" role="dialog" aria-labelledby="gfgErrorModalLabel" aria-hidden="true">
    <div class="vertical-alignment-helper">
        <div class="modal-dialog vertical-align-center">
            <div class="gfgmodal-content modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">×</span><span class="sr-only">Close</span>
                    </button>
                     <h4 class="modal-title text-danger" id="gfgErrorModalLabel">Error!</h4>
                </div>
                <div class="modal-body" id="gfgErrorModalBody">...</div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-primary" data-dismiss="modal">Close</button>
                </div>
            </div>
        </div>
    </div>
</div>

    <!--Edit Modal -->
<div class="modal fade" id="editProblemModal">
    <div class="modal-dialog ">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">×</button>
                <h4 class="modal-title">Select Operation Mode</h4>
            </div>
                        <div class="modal-footer">
                            </div>
        </div>
    </div>
</div>

  <div class="modal fade" id="reportIssue" tabindex="-1" role="dialog">
      <div class="modal-dialog modal-lg" role="document">
          <div class="modal-content">
              <div class="modal-header">
                  <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span></button>
                  <h4 class="modal-title text-center" id="myModalLabel">Please report if you are facing any issue on this page.<br> <small><script>document.write(window.location.href)</script>https://practice.geeksforgeeks.org/problems/add-1-to-a-number-represented-as-linked-list/1</small>  </h4>
              </div>
              <div class="modal-body">
                  <form class="form-horizontal" role="form">                
                      <div class="form-group">
                          <label class="col-sm-1 control-label" style="text-align:left;" for="inputTestCase">Issue Type <span style="color:red">*</span></label>
                          <div class="col-sm-10">
                            <div class="dropdown dropIssue">
                              <button class="btn btn-primary dropdown-toggle" id="issueMenu" type="button" data-toggle="dropdown" name="Content">Content Related Issue <span class="caret"></span></button>
                              <ul class="dropdown-menu" role="menu" aria-labelledby="issueMenu">
                                <li role="presentation" class="softwareMenu"><a role="menuitem" tabindex="-1">Sofware Related Issue</a></li>
                                <li role="presentation" class="divider"></li>
                                <li role="presentation" class="contentMenu"><a role="menuitem" tabindex="-1">Content Related Issue</a></li>    
                              </ul>
                            </div>
                            <br><span class="issueNote" style="display: inline;"><strong>Examples of </strong><strong class="noteIssue">Content Related Issue </strong> <span class="issueDescription">: related to Problem Statement, Test Cases, Run Time or Compilation Errors, Wrong Answer etc</span>.<br><strong class="secondaryNoteIssue">Examples of Software Related Issue </strong> <span class="secondaryIssueDescription">: related to Marks, Videos, UI related etc</span>.<br><br>For queries regarding questions and quizzes, use the comment area below respective pages.</span>
                          </div>
                      </div>
                      <div class="form-group">
                          <label class="col-sm-1 control-label" style="text-align:left;" for="inputTestCase">Describe Your Issue <span style="color:red">*</span></label>
                          <div class="col-sm-10">
                              <textarea id="reportIssueDescription" class="form-control" rows="7" cols="100" name="issueDescription" style="max-width: 100%;min-width: 100%;"></textarea>
                          </div>
                      </div>
                      <div class="form-group">
                          <label class="col-sm-1 control-label" style="text-align:left;" for="inputTestCase">Attach Screenshot (optional)</label>
                          <div class="col-sm-10">
                              <input type="file" accept="image/x-png,image/jpeg" name="reportIssueImage" class="reportIssueAttach">
                          </div>
                      </div>
                 </form>
             </div>
             <div class="modal-footer">
                <button type="button" class="btn btn-warning" data-dismiss="modal" id="reportIssueMail" style="float:right;margin-left:5px;border-radius:0.3rem;">Send</button>
                <button type="button" class="btn btn-default" data-dismiss="modal" style="float:right; border-radius:0.3rem;">Close</button>
             </div>
          </div>
      </div>
  </div><iframe style="display: none; max-width: 100%;" src="./Add1 to a number represented as linked list_files/saved_resource(5).html"></iframe>


<div class="modal fade" id="editorialVideo" tabindex="-1" role="dialog">
    <div class="modal-dialog modal-lg" role="document">
        <div class="modal-content">
            <div class="modal-body" style="height:auto; overflow:auto; max-width:100%">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span></button>
                <div class="player-container" id="course-video-container">
                    <video oncontextmenu="return false;" id="videoModal" class="video-js" controls="" autoplay=""> </video>
                </div>
            </div>
        </div>
    </div>
</div>


  <div id="gfg-snackbar" style="z-index:10000"></div>
<table cellspacing="0" cellpadding="0" class="gstl_50 gssb_c" style="width: 2px; display: none; top: 3px; position: absolute; left: -1px;"><tbody><tr><td class="gssb_f"></td><td class="gssb_e" style="width: 100%;"></td></tr></tbody></table><table cellspacing="0" cellpadding="0" class="gstl_51 gssb_c" style="width: 2px; display: none; top: 3px; position: absolute; left: -1px;"><tbody><tr><td class="gssb_f"></td><td class="gssb_e" style="width: 100%;"></td></tr></tbody></table><ins class="adsbygoogle adsbygoogle-noablate" data-adsbygoogle-status="done" style="display: none !important;"><ins id="aswift_0_expand" style="display:inline-table;border:none;height:0px;margin:0;padding:0;position:relative;visibility:visible;width:0px;background-color:transparent;" tabindex="0" title="Advertisement" aria-label="Advertisement"><ins id="aswift_0_anchor" style="display:block;border:none;height:0px;margin:0;padding:0;position:relative;visibility:visible;width:0px;background-color:transparent;"><iframe id="aswift_0" name="aswift_0" style="left: 0px; position: absolute; top: 0px; border: 0px; max-width: 100%;" sandbox="allow-forms allow-popups allow-popups-to-escape-sandbox allow-same-origin allow-scripts allow-top-navigation-by-user-activation" frameborder="0" src="./Add1 to a number represented as linked list_files/ads.html" marginwidth="0" marginheight="0" vspace="0" hspace="0" allowtransparency="true" scrolling="no" allowfullscreen="true" data-google-container-id="a!1" data-load-complete="true"></iframe></ins></ins></ins><iframe id="google_osd_static_frame_4312297626474" name="google_osd_static_frame" style="display: none; width: 0px; height: 0px; max-width: 100%;" src="./Add1 to a number represented as linked list_files/saved_resource(6).html"></iframe><div id="fb-root" class=" fb_reset"><div style="position: absolute; top: -10000px; width: 0px; height: 0px;"><div></div></div></div></body><iframe id="google_esf" name="google_esf" src="./Add1 to a number represented as linked list_files/zrt_lookup.html" data-ad-client="ca-pub-9454946816537646" style="display: none; max-width: 100%;"></iframe></html>