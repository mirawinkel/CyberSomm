function main() {
    question.innerHTML = 'What style of main dish are you enjoying?';
    pair.drawButton('Meats', meat, 'Veggies', veggie, 'Pasta', pasta);
}

function meat() {
    question.innerHTML = 'What type of protein are you enjoying?';
    pair.drawButton('Surf', surf, 'Terf', terf, 'Poultry', poultry);
}

// *******  Seafood ********

function surf() {
    question.innerHTML = 'What type of seafood are you enjoying?';
    pair.drawButton('Shellfish', shellfish, 'White Fish', whiteFish, 'Salmon / Ahi', salmonAhi);
}
function shellfish() {
    question.innerHTML = 'What type of shellfish are you enjoying?';
    pair.drawButton('Crab / Lobster', crabLobster, 'Shrimp / Crayfish', shrimpCrayfish, 'Clam / Mussel / Oyster', biValves);
}
function crabLobster() {
    question.innerHTML = 'Is the dish...';
    pair.drawButton('Butter or Cream Driven', crabButter, 'Salad or Fruit Driven', crabSalad, 'Robust or Spicy', crabRobust);
}
function shrimpCrayfish() {
    question.innerHTML = 'Is the dish...';
    pair.drawButton('Butter or Cream Driven', shrimpButter, 'Salad or Fruit Driven', shrimpSalad, 'Robust or Spicy', shrimpRobust);
}
function biValves() {
    question.innerHTML = 'Is the dish...';
    pair.drawButton('Butter or Cream Driven', biButter, 'Salad or Raw', biSalad, 'Robust or Spicy', biSpicy);
}
function whiteFish() {
    question.innerHTML = 'Is the fish...';
    pair.drawButton('Light and Flakey (halibut)', whiteFlake, 'Firm (swordfish)', whiteFirm, 'Rich and Fatty (black cod)', whiteFatty);
}
function whiteFlake() {
    question.innerHTML = 'Is the dish...';
    pair.drawButton('Butter or Cream Driven', flakeButter, 'Grilled or Seared', flakeGrill, 'Robust or Spicy', flakeSpicy);
}
function  whiteFirm() {
    question.innerHTML = 'Is the dish...';
    pair.drawButton('Butter or Cream Driven', firmButter, 'Grilled or Seared', firmGrill, 'Robust or Spicy', firmSpicy);
}
function whiteFatty() {
    question.innerHTML = 'Is the dish...';
    pair.drawButton('Butter or Cream Driven', fattyButter, 'Broiled or Seared', fattyGrill, 'Robust or Spicy', fattySpicy);
}
function salmonAhi() {
    question.innerHTML = 'Is the dish...';
    pair.drawButton('Butter or Cream Driven', biButter, 'Salad or Raw', biSalad, 'Robust or Spicy', biSpicy);
}
function  crabButter() {
    pair.results.push("Oakey Chardonnay to compliment the butter and richness");
    pair.results.push("Not Oakey Chardonnay to provide some bright acid and minerality to pair");
    pair.results.push("Sauvignon Blanc to provide some bright acid and grassy/citrus notes to pair");
    pair.results.push("Sparkling Wine to lift and cleanse the pallet in between bites");
    pair.results.push("Pinto Gris/Grigio to provide elegant apple and mineral notes");
    ShowResults();
}
function crabSalad() {
    pair.results.push("Albarino to provide floral and mineral notes playing with delicate flavors");
    pair.results.push("Not Oakey Chardonnay to provide some bright acid and minerality to pair");
    pair.results.push("Sauvignon Blanc to provide some bright acid and grassy/citrus notes to pair");
    pair.results.push("Sparkling Wine to lift and cleanse the pallet in between bites");
    pair.results.push("Pinto Gris/Grigio to provide elegant apple and mineral notes");
    pair.results.push("Riesling to compliment the sweetness in the shellfish");
    ShowResults();
}
function crabRobust() {
    pair.results.push("Not Oakey Chardonnay to provide some bright acid and minerality to pair");
    pair.results.push("Sauvignon Blanc to provide some bright acid and soften the richness");
    pair.results.push("Sparkling Wine to lift and cleanse the pallet in between bites");
    pair.results.push("Pinto Noir to give acid to lighten the richness and red fruit to brighten the dish");
    pair.results.push("Chianti to provide gentle tannin to play with the richness, bright fruit to liven the bited");
    pair.results.push("Gewurtztraminer to provide floral and stone fruit notes, and a little sweetness to play with spice");
    ShowResults();
}
function  shrimpButter() {
    pair.results.push("Chenin Blanc to provide richness and rich fruit to compliment the shrimp");
    pair.results.push("Rose to provide acid to cut the richness and light fruit to compliment the shrimp");
    pair.results.push("Not Oakey Chardonnay to provide some bright acid and minerality to pair");
    pair.results.push("Sauvignon Blanc to provide some bright acid and grassy/citrus notes to pair");
    pair.results.push("Sparkling Wine to lift and cleanse the pallet in between bites");
    pair.results.push("Pinto Gris/Grigio to provide elegant apple and mineral notes");
    pair.results.push("Riesling to compliment the sweetness in the shrimp");
    ShowResults();
}
function shrimpSalad() {
    pair.results.push("Albarino to provide floral and mineral notes playing with delicate flavors");
    pair.results.push("Rose to provide acid to cut the richness and light fruit to compliment the shrimp");
    pair.results.push("Sparkling Wine to lift and cleanse the pallet in between bites");
    pair.results.push("Pinto Gris/Grigio to provide elegant apple and mineral notes");
    pair.results.push("Riesling to compliment the sweetness in the shellfish");
    ShowResults();
}
function shrimpRobust() {
    pair.results.push("Chenin Blanc to provide richness and rich fruit to compliment the shrimp");
    pair.results.push("Rose to provide acid to cut the richness and light fruit to compliment the shrimp");
    pair.results.push("Not Oakey Chardonnay to provide some bright acid and minerality to pair");
    pair.results.push("Sauvignon Blanc to provide some bright acid and grassy/citrus notes to pair");
    pair.results.push("Pinto Noir to give acid to lighten the richness and red fruit to brighten the dish");
    pair.results.push("Riesling to compliment the sweetness in the shrimp and spice in the dish");
    pair.results.push("Gewurtztraminer to provide floral and stone fruit notes, and a little sweetness to play with spice");
    ShowResults();
}
function biButter() {
    pair.results.push("Rose to provide acid to cut the richness and minerality");
    pair.results.push("Not Oakey Chardonnay to provide some bright acid and minerality to pair");
    pair.results.push("Sauvignon Blanc to provide some bright acid and grassy/citrus notes to pair");
    pair.results.push("Sparkling Wine to lift and cleanse the pallet in between bites");
    pair.results.push("Pinto Gris/Grigio to provide elegant apple and mineral notes");
    ShowResults();
}
function biSalad() {
    pair.results.push("Albarino to provide floral and mineral notes playing with delicate flavors");
    pair.results.push("Rose to provide acid to cut the richness and minerality that's especially good with raw oysters");
    pair.results.push("Sparkling Wine to lift and cleanse the pallet in between bites, the best for raw oysters");
    pair.results.push("Pinto Gris/Grigio to provide elegant apple and mineral notes");
    pair.results.push("Gewurtztraminer to provide floral and stone fruit notes, and a little sweetness");
    pair.results.push("Riesling to compliment the sweetness in the shellfish");
    ShowResults();
}
function biSpicy() {
    pair.results.push("Chenin Blanc to provide richness and rich fruit to compliment the shrimp");
    pair.results.push("Rose to provide acid to cut the richness and light fruit to compliment");
    pair.results.push("Not Oakey Chardonnay to provide some bright acid and minerality to pair");
    pair.results.push("Sauvignon Blanc to provide some bright acid and grassy/citrus notes to pair");
    pair.results.push("Riesling to compliment the sweetness in the shrimp and spice in the dish");
    pair.results.push("Gewurtztraminer to provide floral and stone fruit notes, and a little sweetness to play with spice");
    pair.results.push("Pinto Noir to give acid to lighten the richness and red fruit to brighten the dish");
    ShowResults();
}
function flakeButter() {
    pair.results.push("Oakey Chardonnay to compliment the butter and richness");
    pair.results.push("Not Oakey Chardonnay to provide some bright acid and minerality to pair");
    pair.results.push("Sauvignon Blanc to provide some bright acid and grassy/citrus notes to pair");
    pair.results.push("Rose to provide acid to cut the richness and light fruit to compliment");
    pair.results.push("Sparkling Wine to lift and cleanse the pallet in between bites");
    ShowResults();
}
function flakeGrill() {
    pair.results.push("Not Oakey Chardonnay to provide some bright acid and minerality to pair");
    pair.results.push("Sauvignon Blanc to provide some bright acid and grassy/citrus notes to pair");
    pair.results.push("Pinto Gris/Grigio to provide elegant apple and mineral notes");
    pair.results.push("Rose to provide acid to cut the richness and light fruit/minerality to compliment");
    ShowResults();
}
function flakeSpicy() {
    pair.results.push("Chenin Blanc to provide richness and rich fruit to compliment");
    pair.results.push("Rose to provide acid to cut the richness and light fruit to compliment");
    pair.results.push("Not Oakey Chardonnay to provide some bright acid and minerality to pair");
    pair.results.push("Sauvignon Blanc to provide some bright acid and grassy/citrus notes to pair");
    pair.results.push("Riesling to compliment the spice in the dish");
    pair.results.push("Gewurtztraminer to provide floral and stone fruit notes, and a little sweetness to play with spice");
    ShowResults();
}
function firmButter() {
    pair.results.push("Oakey Chardonnay to compliment the butter and richness");
    pair.results.push("Chenin Blanc to compliment the richness with rich fruit");
    pair.results.push("Not Oakey Chardonnay to provide some bright acid and minerality to pair");
    pair.results.push("Sauvignon Blanc to provide some bright acid and grassy/citrus notes to pair");
    pair.results.push("Rose to provide acid to cut the richness and light fruit to compliment");
    pair.results.push("Sparkling Wine to lift and cleanse the pallet in between bites");
    ShowResults();
}
function firmGrill() {
    pair.results.push("Oakey Chardonnay to compliment the richness of the fish");
    pair.results.push("Chenin Blanc to compliment the richness with rich fruit");
    pair.results.push("Not Oakey Chardonnay to provide some bright acid and minerality to pair");
    pair.results.push("Sauvignon Blanc to provide some bright acid and grassy/citrus notes to pair");
    ShowResults();
}
function firmSpicy() {
    pair.results.push("Oakey Chardonnay to compliment the richness of the fish");
    pair.results.push("Chenin Blanc to compliment the richness with rich fruit");
    pair.results.push("Not Oakey Chardonnay to provide some bright acid and minerality to pair");
    pair.results.push("Riesling to compliment the spice in the dish");
    pair.results.push("Gewurtztraminer to provide floral and stone fruit notes, and a little sweetness to play with spice");
    ShowResults();
}
function fattyButter() {
    pair.results.push("Oakey Chardonnay to compliment the butter and richness");
    pair.results.push("Chenin Blanc to compliment the richness with rich fruit");
    pair.results.push("Not Oakey Chardonnay to provide some bright acid and minerality to pair");
    pair.results.push("Sauvignon Blanc to provide some bright acid and grassy/citrus notes to pair");
    pair.results.push("Orange wine to provide acid to cut the richness and rich tertiary funk to compliment");
    pair.results.push("Sparkling Wine to lift and cleanse the pallet in between bites");
    ShowResults();
}
function fattyGrill() {
    pair.results.push("Oakey Chardonnay to compliment the richness of the fish");
    pair.results.push("Chenin Blanc to compliment the richness with rich fruit");
    pair.results.push("Not Oakey Chardonnay to provide some bright acid and minerality to pair");
    pair.results.push("Orange wine to provide acid to cut the richness and rich tertiary funk to compliment");
    ShowResults();
}
function fattySpicy() {
    pair.results.push("Oakey Chardonnay to compliment the richness of the fish");
    pair.results.push("Chenin Blanc to compliment the richness with rich fruit");
    pair.results.push("Riesling to compliment the spice in the dish");
    pair.results.push("Gewurtztraminer to provide floral and stone fruit notes, and a little sweetness to play with spice");
    pair.results.push("Orange wine to provide acid to cut the richness and rich tertiary funk to compliment");
    ShowResults();
}


// ******** Land Meat *********

function terf() {
    pair.results.push("Results still a work in progress");
    pair.results.push("please check back soon for updates!");
    pair.results.push("cheers from the CyberSomm team");
    ShowResults();
}
function poultry() {
    pair.results.push("Results still a work in progress");
    pair.results.push("please check back soon for updates!");
    pair.results.push("cheers from the CyberSomm team");
    ShowResults();
}

// ******* Veggie *******
function veggie() {
    question.innerHTML = 'What style of vegetables are you enjoying?';
    pair.drawButton('Root Veggies', root, 'Green Veggies', green, 'Squash', squash);
}
function root() {
    question.innerHTML = 'What root vegetables are you enjoying?';
    pair.drawButton('Sweet (Yams/Carrots)', sweetRoot, 'Earthy (beets)', earthyRoot, 'Potato / Celeriac', starchRoot);
}
function green() {
    pair.results.push("Results still a work in progress");
    pair.results.push("please check back soon for updates!");
    pair.results.push("cheers from the CyberSomm team");
    ShowResults();
}
function squash() {
    pair.results.push("Results still a work in progress");
    pair.results.push("please check back soon for updates!");
    pair.results.push("cheers from the CyberSomm team");
    ShowResults();
}
function sweetRoot() {
    pair.results.push("Results still a work in progress");
    pair.results.push("please check back soon for updates!");
    pair.results.push("cheers from the CyberSomm team");
    ShowResults();
}
function earthyRoot() {
    pair.results.push("Results still a work in progress");
    pair.results.push("please check back soon for updates!");
    pair.results.push("cheers from the CyberSomm team");
    ShowResults();
}
function starchRoot() {
    pair.results.push("Results still a work in progress");
    pair.results.push("please check back soon for updates!");
    pair.results.push("cheers from the CyberSomm team");
    ShowResults();
}
function pasta() {
    question.innerHTML = 'What style of pasta are you enjoying?';
    pair.drawButton('Red Sauce', redPasta, 'White Sauce', whitePasta, 'Something Else', otherPasta);
}
function redPasta() {
    pair.results.push("Results still a work in progress");
    pair.results.push("please check back soon for updates!");
    pair.results.push("cheers from the CyberSomm team");
    ShowResults();
}
function whitePasta() {
    pair.results.push("Results still a work in progress");
    pair.results.push("please check back soon for updates!");
    pair.results.push("cheers from the CyberSomm team");
    ShowResults();
}
function otherPasta() {
    pair.results.push("Results still a work in progress");
    pair.results.push("please check back soon for updates!");
    pair.results.push("cheers from the CyberSomm team");
    ShowResults();
}
function cheese() {
    question.innerHTML = 'What style of cheese are you enjoying?';
    pair.drawButton('Creamy', creamyCheese, 'Hard', hardCheese, 'Blue', blueCheese);
}
function creamyCheese() {
    pair.results.push("Results still a work in progress");
    pair.results.push("please check back soon for updates!");
    pair.results.push("cheers from the CyberSomm team");
    ShowResults();
}
function hardCheese() {
    pair.results.push("Results still a work in progress");
    pair.results.push("please check back soon for updates!");
    pair.results.push("cheers from the CyberSomm team");
    ShowResults();
}
function blueCheese() {
    pair.results.push("Results still a work in progress");
    pair.results.push("please check back soon for updates!");
    pair.results.push("cheers from the CyberSomm team");
    ShowResults();
}
function apps() {
    question.innerHTML = 'What style of appetizer are you enjoying?';
    pair.drawButton('Fried', fried, 'Chilled', chilled, 'Warm', warm);
}
function fried() {
    pair.results.push("Results still a work in progress");
    pair.results.push("please check back soon for updates!");
    pair.results.push("cheers from the CyberSomm team");
    ShowResults();
}
function chilled() {
    pair.results.push("Results still a work in progress");
    pair.results.push("please check back soon for updates!");
    pair.results.push("cheers from the CyberSomm team");
    ShowResults();
}
function warm() {
    pair.results.push("Results still a work in progress");
    pair.results.push("please check back soon for updates!");
    pair.results.push("cheers from the CyberSomm team");
    ShowResults();
}
function dessert() {
    pair.results.push("Results still a work in progress");
    pair.results.push("please check back soon for updates!");
    pair.results.push("cheers from the CyberSomm team");
    ShowResults();
}


function foodPair() {
    question.innerHTML = 'What kind of food would you like to pair your wine with?';
    pair.drawButton('Appetizers', apps, 'Main Course', main, 'Desserts', dessert);
}
