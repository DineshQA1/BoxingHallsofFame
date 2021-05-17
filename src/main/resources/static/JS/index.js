'use strict';

const TABLE = document.querySelector("#table");
const NAME = document.querySelector("#name");
const WEIGHT = document.querySelector("#weight");
const BOUTS = document.querySelector("#bouts");
const WON = document.querySelector("#won");
const LOST = document.querySelector("#lost");
const DRAWN = document.querySelector("#drawn");
const KO = document.querySelector("#ko");
const UNDISPUTED = document.querySelector("#undisputed")
const ALERT = document.querySelector("#fighterCreated");

axios.get("http://localhost:9094/h2-console")
.then((response)=>{
    console.log(response);
    for(let  data of response.data.data){
    printToScreen (data);}
    window.location.reload();
})
.catch((err)=>{
console.error(err);
});

const printToScreen = (info)=> {
    const text = document.createTextNode(`${info.name} ${info.weight} ${info.bouts} ${info.won} ${info.lost} ${info.drawn} ${info.ko} ${info.undisputed}`)
    // <p> <firstname> <lastname> <email> </p>

   document.getElementById("#name").appendChild(text);
    TABLE.appendChild(text);
    document.getElementById("#weight").appendChild(text);
    TABLE.appendChild(text);
    document.getElementById("#bouts").appendChild(text);
    TABLE.appendChild(text);
    document.getElementById("#won").appendChild(text);
    TABLE.appendChild(text);
    document.getElementById("#lost").appendChild(text);
    TABLE.appendChild(text);
    document.getElementById("#drawn").appendChild(text);
    TABLE.appendChild(text);
    document.getElementById("#ko").appendChild(text);
    TABLE.appendChild(text);
    document.getElementById("#undisputed").appendChild(text);
    TABLE.appendChild(text); 
}

const createFighter=() => {
    const NAME_VALUE = NAME.value;
    const WEIGHT_VALUE = WEIGHT.value;
    const BOUTS_VALUE = BOUTS.value;
    const WON_VALUE = WON.value;
    const LOST_VALUE = LOST.value;
    const DRAWN_VALUE = DRAWN.value;
    const KO_VALUE = KO.value;
    const UNDISPUTED_VALUE = UNDISPUTED.value;
    
    console.log(`${NAME_VALUE} ${WEIGHT_VALUE} ${BOUTS_VALUE} ${WON_VALUE} ${LOST_VALUE} ${DRAWN_VALUE} ${KO_VALUE} ${UNDISPUTED_VALUE}`);
    

    let obj = {
        name: NAME_VALUE,
        weight: WEIGHT_VALUE,
        bouts: BOUTS_VALUE,
        won: WON_VALUE,
        lost: LOST_VALUE,
        drawn: DRAWN_VALUE,
        ko: KO_VALUE,
        undisputed: UNDISPUTED_VALUE  
    };

    axios
    .post("http://localhost:9094/h2-console", obj)
    .then((res) => {
        console.log(res);
        ALERT.setAttribute ("class", "alert-alert-warning");
        ALERT.innerHTML = "Fighter added to the boxing hall of fame!"
        setTimeout(()=>{
            ALERT.removeAttribute("class");
            ALERT.innerHTML  = "";
        },2800);
    })
        //window.location.reload();
    .catch((err) => console.error(err));

}