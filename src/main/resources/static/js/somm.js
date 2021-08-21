const button1 = document.getElementById('button1');
const button2 = document.getElementById('button2');
const button3 = document.getElementById('button3');
const resetButton = document.getElementById('reset');
const question = document.getElementById('question');
const resultBox = document.getElementById('resultBox');
const pagination  = document.getElementById('pagination');

const pair = new PairingManager
let currentPage = 1;
let rows = 12;



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

function PaginationButton(page, items) {
    let button = document.createElement('button');
    button.innerText = page;
    if (currentPage === page) button.classList.add('active');
    button.addEventListener('click', function() {
        currentPage = page;
        DisplayList(items, currentPage);
        let currentBtn = document.querySelector('.pageNumbers button.active');
        currentBtn.classList.remove('active');
        button.classList.add('active');
    })
    return button;
}

function SetupPagination (items) {
    pagination.innerHTML = "";
    let pageCount = Math.ceil(items.length / rows);
    for (let i = 1; i < pageCount + 1; i++) {
        let btn = PaginationButton(i, items);
        pagination.appendChild(btn);
    }
}

function DisplayList (items, page) {
    while (question.firstChild) {
        question.removeChild(question.firstChild);
    }
    page --;
    let start = rows * page;
    let end = start + rows;
    let paginatedItems = items.slice(start, end);

    for (let wine of paginatedItems) {
        let div = document.createElement("div");
        let link = document.createElement("a");
        link.text = wine.producer + " " + wine.name + " " + wine.vintage + " " + wine.region + "  $" + wine.price;
        link.href = "/wineInformation?wineId=" + wine.id;
        link.target = "_blank";
        link.classList = "resultLink";
        question.appendChild(div);
        div.appendChild(link)
    }
}


function ShowResults() {

    button1.hidden = true;
    button2.hidden = true;
    button3.hidden = true;
    resultBox.style = "outline:.12rem solid rgb(100, 39, 62); padding:2rem 2rem 0 2rem; width:50rem;"
    question.innerHTML = 'The following wines would pair exceptionally with your food today:';
    resultBox.classList.add("backFade");

    DisplayList(pair.results, currentPage);
    SetupPagination(pair.results);
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

