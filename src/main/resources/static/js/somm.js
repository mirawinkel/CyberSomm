const button1 = document.getElementById('button1');
const button2 = document.getElementById('button2');
const button3 = document.getElementById('button3');
const resetButton = document.getElementById('reset');
const question = document.getElementById('question');
const resultBox = document.getElementById('resultBox');

const pair = new PairingManager


function Reset () {
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
    while (pagination.firstChild) {
        pagination.removeChild(pagination.firstChild);
    }
    resultBox.style = "";
    resultBox.classList.remove("backFade");
    pair.reset();
}

function ShowResults() {

    button1.hidden = true;
    button2.hidden = true;
    button3.hidden = true;
    resultBox.style = "outline:.12rem solid rgb(100, 39, 62); padding:2rem 2rem 0 2rem; width:50rem;"
    question.innerHTML = 'The following wines would pair exceptionally with your food today:';
    resultBox.classList.add("backFade");

    DisplayWineList(pair.results, currentPage);
    SetupPagination(pair.results, DisplayWineList);
}

pair.reset()
resetButton.addEventListener('click', Reset)

async function FindWines(keyword, input) {
    for await (let item of input) {
        const response = await fetch('http://localhost:8080/' + keyword + '?' + keyword + '=' + item);
        const results = await response.json();
        for await (let wine of results) {
            pair.results.push(wine);
        }
    }
    await ShowResults();
}

