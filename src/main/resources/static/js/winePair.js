

function winePair() {
    question.innerHTML = 'What kind of wine are you enjoying?';
    pair.drawButton('White', white, 'Red', red, 'Sparkling', sparkling)
}
function red() {
    question.innerHTML = 'What kind of red wine are you enjoying?';
    pair.drawButton('Big and Bold', boldRed, 'Medium Bodied', mediumRed, 'Light and Elegant', lightRed)
}
function boldRed() {
    let inputs = ['Cabernet Sauvignon', 'Tempranillo'];
    FindWines('varietal', inputs);
}


function white() {
    question.innerHTML = 'What kind of white wine are you enjoying?';
    pair.drawButton('Oakey or Buttery', bigWhite, 'Bright and Refreshing', acidWhite, 'Floral or Sweet', sweetWhite)
}

function acidWhite() {
    pair.results.push("Results still a work in progress");
    pair.results.push("please check back soon for updates!");
    pair.results.push("cheers from the CyberSomm team");
    ShowResults();
}


