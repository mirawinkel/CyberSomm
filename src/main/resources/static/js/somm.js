const button1 = document.getElementById('button1');
const button2 = document.getElementById('button2');
const button3 = document.getElementById('button3');
const resetButton = document.getElementById('reset');
const question = document.getElementById('question');
const resultBox = document.getElementById('resultBox');

const pair = new PairingManager

function reset () {
    if (button1.hidden === true) {
        button1.hidden = false;
    }
    if (button2.hidden === true) {
        button2.hidden = false;
    }
    if (button3.hidden === true) {
        button3.hidden = false;
    }
    while (question.firstChild) {
        question.removeChild(question.firstChild);
    }
    resultBox.style = "";
    resultBox.classList.remove("backFade");
    pair.reset();
}
function showResults() {
    button1.hidden = true;
    button2.hidden = true;
    button3.hidden = true;
    resultBox.style = "outline:.12rem solid rgb(100, 39, 62); padding:2rem;"
    question.innerHTML = 'The following types of wine would pair excellently with your food today:';
    resultBox.classList.add("backFade");
    let divide = document.createElement("div");
    question.appendChild(divide);
    pair.results.forEach(result => {
        let element = document.createElement("div");
        let br = document.createElement("br");
        question.appendChild(br);
        question.appendChild(br);
        element.classList="resultElement";
        element.innerHTML = result;
        question.appendChild(element);
    });
}

button1.addEventListener('click', foodPair)
button2.addEventListener('click', winePair)
button3.addEventListener('click', lifePair)
resetButton.addEventListener('click', reset)