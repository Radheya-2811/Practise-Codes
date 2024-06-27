// document.getElementById('prayer').onclick=function () {
//     alert("prayer selected")
// }

// document.getElementById("prayer").addEventListener('click',function(e){
//     console.log(e);
// })
// document.getElementById('prayer').addEventListener('click',function(e){
//     console.log("prayer clicked");
    
// },true)
// document.getElementById("images").addEventListener('click',function(e){
//     console.log("images clicked");
//     e.stopPropagation();
// },true)

const images=document.querySelector('#images')
images.addEventListener('click',function(e){
    console.log(e.target.tagName);
    if(e.target.tagName=='IMG'){
        e.target.parentNode.remove()
    }
},false)