

function main() {
    question.innerHTML = 'What style of main dish are you enjoying?';
    pair.drawButton('Meats', meat, 'Veggies', veggie, 'Pasta', pasta);
}

function meat() {
    question.innerHTML = 'What type of protein are you enjoying?';
    pair.drawButton('Surf', surf, 'Terf', terf, 'Poultry', poultry);
}
function surf() {

}
function terf() {

}
function poultry() {

}
function veggie() {
    question.innerHTML = 'What style of vegetables are you enjoying?';
    pair.drawButton('Root Veggies', root, 'Green Veggies', green, 'Squash', squash);
}
function root() {

}
function green() {

}
function squash() {

}
function pasta() {
    question.innerHTML = 'What style of pasta are you enjoying?';
    pair.drawButton('Red Sauce', redPasta, 'White Sauce', whitePasta, 'Something Else', otherPasta);
}
function redPasta() {

}
function whitePasta() {

}
function otherPasta() {

}
function cheese() {
    question.innerHTML = 'What style of cheese are you enjoying?';
    pair.drawButton('Creamy', creamyCheese, 'Hard', hardCheese, 'Blue', blueCheese);
}
function creamyCheese() {

}
function hardCheese() {

}
function blueCheese() {

}
function apps() {
    question.innerHTML = 'What style of appetizer are you enjoying?';
    pair.drawButton('Fried', fried, 'Chilled', chilled, 'Warm', warm);
}
function fried() {

}
function chilled() {

}
function warm() {

}
function dessert() {
    question.innerHTML = 'What style of dessert are you enjoying?';
    pair.drawButton('Fruit Focused', meat, 'Rich and Intense', veggie, 'Cheeses', cheese);
}


function foodPair() {
    question.innerHTML = 'What kind of food would you like to pair your wine with?';
    pair.drawButton('Appetizers', apps, 'Main Course', main, 'Desserts', dessert);
}
