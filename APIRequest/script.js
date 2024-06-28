const requestUrl="https://api.github.com/users/Radheya-2811"
const xhr=new XMLHttpRequest();
xhr.open('GET',requestUrl)
xhr.onreadystatechange=function(){
    console.log(xhr.readyState);
    const stateValue=xhr.readyState
    if(xhr.readyState==4){
        const data=this.responseText
       // console.log(data);
       const jsonData=JSON.parse(data);
        console.log(jsonData.followers);
    }
}

xhr.send()
