const resultTarget = document.getElementById("resultTarget");
const pagination  = document.getElementById('pagination');

let currentPage = 1;
let rows = 12;
let resultList = [];

function PaginationButton(page, items, targetFunction) {
    let button = document.createElement('button');
    button.innerText = page;
    if (currentPage === page) button.classList.add('active');
    button.addEventListener('click', function() {
        currentPage = page;
        targetFunction(items, currentPage);
        let currentBtn = document.querySelector('.pageNumbers button.active');
        currentBtn.classList.remove('active');
        button.classList.add('active');
    })
    return button;
}

function SetupPagination (items, targetFunction) {
    pagination.innerHTML = "";
    let pageCount = Math.ceil(items.length / rows);
    for (let i = 1; i < pageCount + 1; i++) {
        let btn = PaginationButton(i, items, targetFunction);
        pagination.appendChild(btn);
    }
}

function DisplayConsoleList (items, page) {
    while (resultTarget.firstChild) {
        resultTarget.removeChild(resultTarget.firstChild);
    }
    page --;
    let start = rows * page;
    let end = start + rows;
    let paginatedItems = items.slice(start, end);

    for (let item of paginatedItems) {
        let div = document.createElement("div");
        let divText = "";
        for(let field of item) {
            divText = divText + field + " ";
        }
        div.classList = "mb-2";
        div.innerHTML = divText;
        resultTarget.appendChild(div);
    }
}

function DisplayWineList (items, page) {
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
        link.href = "/wine_information?wineId=" + wine.id;
        link.target = "_blank";
        link.classList = "resultLink";
        question.appendChild(div);
        div.appendChild(link)
    }
}

function ShowConsoleList(resultList) {
    DisplayConsoleList(resultList, currentPage);
    SetupPagination(resultList, DisplayConsoleList);
}