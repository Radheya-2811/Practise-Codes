const promiseOne=new Promise(function(resolve,reject){
    //async task
    setTimeout(function(){
        console.log("task is completed");
        resolve()
    },1000)
})


promiseOne.then(function(){
    console.log("Promise Consumed");
})
 

new Promise(function(resolve,reject){
        setTimeout(function(){
            console.log("Async task 2");
            resolve()
        },1000)
}).then(function(){
    console.log("Task 2 consumed");
})

const promiseThree=new Promise(function(resolve,reject){
        setTimeout(function(){
        resolve({
            username:"Radheya-2811",
            password:"xyz@123"
        })
        },1000)
})

promiseThree.then(function(user){
    console.log(user);
})

// const promiseFour=new Promise(function(resolve,reject){
//     setTimeout(function(){
//         const xml=new XMLHttpRequest()
//         const requestUrl="https://api.github.com/users/Radheya-2811/repos"
//         xml.open('GET',requestUrl)
//         const data=JSON.parse(xml.responseText)
//         resolve(data)
//         xml.send()
      
//     },1000)
// })

// promiseFour.then(function(data){
//     console.log(data);
// })

const promiseFour=new Promise(function(resolve,reject){
        setTimeout(function(){
            let status=false
            if (!status) {
                resolve({
                    username:"radheya-2811",
                    password:"123432"
                })
            } else {
                reject("Failed to authenciate")
            }
        },1000)
})

promiseFour.then(function(userDetails){
        console.log(userDetails);
        return userDetails.username
}).then(function(username){
    console.log(username);
}).catch(function(error){
    console.log(`ERROR:${error}`);
})
.finally(()=>{
    console.log("Operations performed successfully");
})


const promiseFive=new Promise((resolve,reject)=>{
    setTimeout(function(){
        let status=false
        if (status) {
            resolve({
                username:"promiseFive",
                password:"123432"
            })
        } else {
            reject("Failed PromiseFive")
        }
    },1000)
})


async function consumePromiseFive(){
    try {
        const response=await promiseFive
        console.log(response);
    } catch (error) {
        console.log(error);
    }
}

consumePromiseFive()


async function getAllRepos(){
    try {
        const requestUrl='https://api.github.com/users/Radheya-2811/repos'
        const response =await fetch(requestUrl)
        console.log(response);
        const data=await response.json()
        console.log(data);
    } catch (error) {
        console.log("ERROR!!");
    }
}

getAllRepos()

