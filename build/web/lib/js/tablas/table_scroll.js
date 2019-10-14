/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// Code goes here
'use strict'
window.onload = function () {
    var tableCont = document.querySelector('#table-cont')
    /**
     * scroll handle
     * @param {event} e -- scroll event
     */
    function scrollHandle(e) {
        var scrollTop = this.scrollTop;
        this.querySelector('thead').style.transform = 'translateY(' + scrollTop + 'px)';
    }

    tableCont.addEventListener('scroll', scrollHandle)
}
