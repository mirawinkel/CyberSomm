function apps() {
    question.innerHTML = 'What style of appetizer are you enjoying?';
    pair.drawButton('Fried', fried, 'Chilled', chilled, 'Warm', warm);
}

function fried() {
    question.innerHTML = 'What style of fried food are you enjoying?';
    pair.drawButton('Dumpling / Eggroll', dumpling, 'Savory / Meat', meatFried, 'Vegetable', vegFried);
}

function vegFried() {
    question.innerHTML = 'What kind of wine would you like...';
    pair.drawButton('Sweet Wine', sweetWhite, 'Lighter White', lightWhite, 'Bubbles', sparkling);
}

function dumpling() {
    question.innerHTML = 'What kind of wine would you like...';
    pair.drawButton('Sweet Wine', sweetWhite, 'Lighter White', lightWhite, 'Bubbles', sparkling);
}

function meatFried() {
    question.innerHTML = 'What fried appetizers are you enjoying?';
    pair.drawButton('Cheese / Bread', friedCheese, 'Red Meat', redFried, 'White Meat / Seafood', whiteFried);
}

function friedCheese() {
    question.innerHTML = 'What kind of wine would you like...';
    pair.drawButton('Rich White', richWhite, 'Lighter White', lightWhite, 'Bubbles', sparkling);
}

function redFried() {
    question.innerHTML = 'What kind of wine would you like...';
    pair.drawButton('Light Red', lightRed, 'Rich White', richWhite, 'Bubbles', sparkling);
}

function whiteFried() {
    question.innerHTML = 'What kind of wine would you like...';
    pair.drawButton('Sweet Wine', sweetWhite, 'Lighter White', lightWhite, 'Bubbles', sparkling);
}

function chilled() {
    question.innerHTML = 'What chilled appetizers are you enjoying?';
    pair.drawButton('Meat Driven', chilledMeat, 'Veggie Driven', chilledVeggie, 'Seafood / Sushi', sushi);
}

function chilledMeat() {
    question.innerHTML = 'What style of chilled meat appetizers are you enjoying?';
    pair.drawButton('Tartare', tartare, 'Charcuterie', charcuterie, 'Antipasto', antipasto);
}

function tartare() {
    question.innerHTML = 'What kind of wine would you like...';
    pair.drawButton('Light Red', lightRed, 'Light White', lightWhite, 'Bubbles', sparkling);
}

function charcuterie() {
    question.innerHTML = 'What kind of wine would you like...';
    pair.drawButton('Light Red', lightRed, 'Rich White', richWhite, 'Light White', lightWhite);
}

function antipasto() {
    question.innerHTML = 'What kind of wine would you like...';
    pair.drawButton('Light Red', lightRed, 'Light White', lightWhite, 'Medium Red', mediumRed);
}

function chilledVeggie() {
    question.innerHTML = 'What style of chilled veggie appetizers are you enjoying?';
    pair.drawButton('Mushrooms', mushroom, 'Raw', raw, 'Previously Cooked', prevCooked);
}

function mushroom() {
    question.innerHTML = 'What kind of wine would you like...';
    pair.drawButton('Light Red', lightRed, 'Medium Red', mediumRed, 'Rich White', richWhite);
}

function raw() {
    question.innerHTML = 'What kind of wine would you like...';
    pair.drawButton('Sweet White', sweetWhite, 'Light White', lightWhite, 'Sparkling', sparkling);
}

function prevCooked() {
    question.innerHTML = 'What kind of wine would you like...';
    pair.drawButton('Rich White', richWhite, 'Light White', lightWhite, 'Sparkling', sparkling);
}

function sushi() {
    question.innerHTML = 'What kind of wine would you like...';
    pair.drawButton('Sweet White', sweetWhite, 'Light White', lightWhite, 'Sparkling', sparkling);
}

function warm() {
    question.innerHTML = 'What style of warm appetizers are you enjoying?';
    pair.drawButton('Meat / Seafood', warmMeat, 'Veggie', warmVeggie, 'Bread / Dairy', warmDairy);
}

function warmMeat() {
    question.innerHTML = 'What style of meat appetizers are you enjoying?';
    pair.drawButton('Savory', warmSavory, 'Spicy', warmSpicy, 'Seafood', warmSea);
}

function warmSavory() {
    question.innerHTML = 'What style of savory appetizers are you enjoying?';
    pair.drawButton('Red Meat', redApp, 'White Meat', whiteSavory, 'Fioe Gras', sauternes);
}

function redApp() {
    question.innerHTML = 'What kind of wine would you like...';
    pair.drawButton('Light Red', lightRed, 'Medium Red', mediumRed, 'Fruity Red', bigFruitRed);
}

function whiteSavory() {
    question.innerHTML = 'What kind of wine would you like...';
    pair.drawButton('Light White', lightWhite, 'Rich White', richWhite, 'Sparkling', sparkling);
}

function warmSpicy() {
    question.innerHTML = 'What kind of wine would you like...';
    pair.drawButton('Sweet White', sweetWhite, 'Light White', lightWhite, 'Sparkling', sparkling);
}

function warmSea() {
    question.innerHTML = 'What kind of wine would you like...';
    pair.drawButton('Light White', lightWhite, 'Rich White', richWhite, 'Sparkling', sparkling);
}

function warmVeggie() {
    question.innerHTML = 'What kind of wine would you like...';
    pair.drawButton('Light White', lightWhite, 'Sweet White', sweetWhite, 'Sparkling', sparkling);
}

function warmDairy() {
    question.innerHTML = 'What kind of wine would you like...';
    pair.drawButton('Light White', lightWhite, 'Rich White', richWhite, 'Sparkling', sparkling);
}

//*********** Mains *************

function main() {
    question.innerHTML = 'What style of main dish are you enjoying?';
    pair.drawButton('Meats', meat, 'Veggies', veggie, 'Pasta', pasta);
}

function meat() {
    question.innerHTML = 'What type of protein are you enjoying?';
    pair.drawButton('Surf', surf, 'Turf', turf, 'Poultry', poultry);
}

// *******  Seafood Main Course ********

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
    pair.drawButton('Butter or Cream Driven', flakeButter, 'Grilled or Seared', lightWhite, 'Robust or Spicy', flakeSpicy);
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
    question.innerHTML = 'Would you like...';
    pair.drawButton('Richer Wine', richWhite, 'Lighter Wine', lightWhite, 'Bubbles', sparkling);
}
function crabSalad() {
    question.innerHTML = 'Would you like...';
    pair.drawButton('Something Sweeter', sweetWhite, 'Lighter Wine', lightWhite, 'Bubbles', sparkling);
}
function crabRobust() {
    question.innerHTML = 'Would you like...';
    pair.drawButton('White Wine', richWhite, 'Red Wine', lightRed, 'Something Sweet', sweetWhite);
}
function  shrimpButter() {
    question.innerHTML = 'Would you like...';
    pair.drawButton('Richer Wine', richWhite, 'Lighter Wine', lightWhite, 'Bubbles', sparkling);
}
function shrimpSalad() {
    question.innerHTML = 'Would you like...';
    pair.drawButton('Something Sweeter', sweetWhite, 'Lighter Wine', lightWhite, 'Bubbles', sparkling);
}
function shrimpRobust() {
    question.innerHTML = 'Would you like...';
    pair.drawButton('Something Sweeter', sweetWhite, 'Lighter Wine', lightWhite, 'Something Red', lightRed);
}
function biButter() {
    question.innerHTML = 'Would you like...';
    pair.drawButton('Something Sweeter', sweetWhite, 'Lighter Wine', lightWhite, 'Bubbles', sparkling);
}
function biSalad() {
    question.innerHTML = 'Would you like...';
    pair.drawButton('Something Sweeter', sweetWhite, 'Lighter Wine', lightWhite, 'Bubbles', sparkling);
}
function biSpicy() {
    question.innerHTML = 'Would you like...';
    pair.drawButton('Something Sweeter', sweetWhite, 'Lighter Wine', lightWhite, 'Something Red', lightRed);
}
function flakeButter() {
    question.innerHTML = 'Would you like...';
    pair.drawButton('Richer Wine', richWhite, 'Lighter Wine', lightWhite, 'Bubbles', sparkling);
}

function flakeSpicy() {
    question.innerHTML = 'Would you like...';
    pair.drawButton('Richer Wine', richWhite, 'Lighter Wine', lightWhite, 'Something Sweet', sweetWhite);
}
function firmButter() {
    question.innerHTML = 'Would you like...';
    pair.drawButton('Richer Wine', richWhite, 'Lighter Wine', lightWhite, 'Bubbles', sparkling);
}
function firmGrill() {
    question.innerHTML = 'Would you like...';
    pair.drawButton('Richer Wine', richWhite, 'Lighter Wine', lightWhite, 'Bubbles', sparkling);

}
function firmSpicy() {
    question.innerHTML = 'Would you like...';
    pair.drawButton('Richer Wine', richWhite, 'Lighter Wine', lightWhite, 'Sweet White', sweetWhite);
}
function fattyButter() {
    question.innerHTML = 'Would you like...';
    pair.drawButton('Richer Wine', richWhite, 'Lighter Wine', lightWhite, 'Bubbles', sparkling);
}

function fattyGrill() {
    question.innerHTML = 'Would you like...';
    pair.drawButton('Richer Wine', richWhite, 'Lighter Wine', lightWhite, 'Bubbles', sparkling);
}

function fattySpicy() {
    question.innerHTML = 'Would you like...';
    pair.drawButton('Richer Wine', richWhite, 'Lighter Wine', lightWhite, 'Sweet White', sweetWhite);
}


// ******** Land Meat Main Dish *********

function turf() {
    question.innerHTML = 'What kind of meat?';
    pair.drawButton('Red Meat', redMeat, 'White Meat', whiteMeat, 'Wild Game', wildGame);
}

function redMeat() {
    question.innerHTML = 'Is your dish...?';
    pair.drawButton('Spicy', redSpicy, 'Simply Grilled', redSimple, 'Savory', redSavory);
}

function redSpicy() {
    question.innerHTML = 'Would you like...?';
    pair.drawButton('Medium Bodied Red', mediumRed, 'Big Fruity Red', bigFruitRed, 'Lighter Red', lightRed);
}

function redSimple() {
    question.innerHTML = 'Would you like...?';
    pair.drawButton('Medium Bodied Red', mediumRed, 'Big Fruity Red', bigFruitRed, 'Big Dry Red', bigDryRed);
}

function redSavory() {
    question.innerHTML = 'Would you like...?';
    pair.drawButton('Medium Bodied Red', mediumRed, 'Big Fruity Red', bigFruitRed, 'Big Dry Red', bigDryRed);
}


function whiteMeat() {
    question.innerHTML = 'Is your dish...?';
    pair.drawButton('Spicy', sweetWhite, 'Simply Grilled', lightWhite, 'Savory', richWhite);
}

function wildGame() {
    question.innerHTML = 'Is your dish...?';
    pair.drawButton('Spicy', lightRed, 'Simply Grilled', bigFruitRed, 'Savory', bigDryRed);
}
//********** Poultry *************
function poultry() {
    question.innerHTML = 'What kind of poultry?';
    pair.drawButton('Chicken', chicken, 'Turkey/Game', turkey, 'Duck', duck);
}

function turkey() {
    question.innerHTML = 'Is the dish...';
    pair.drawButton('Roasted', roastTurkey, 'Spicy', spicyTurkey, 'Savory', savoryTurkey);
}

function roastTurkey() {
    question.innerHTML = 'What kind of wine would you like?';
    pair.drawButton('Light Red', lightRed, 'Light White', lightWhite, 'Rich White', richWhite);
}

function spicyTurkey() {
    question.innerHTML = 'What kind of wine would you like?';
    pair.drawButton('Sweet', sweetWhite, 'Light White', lightWhite, 'Rich White', richWhite);
}

function savoryTurkey() {
    question.innerHTML = 'What kind of wine would you like?';
    pair.drawButton('Light Red', lightRed, 'Light White', lightWhite, 'Rich White', richWhite);
}

function chicken() {
    question.innerHTML = 'Is the dish...';
    pair.drawButton('Roasted', roastChx, 'Spicy', spicyTurkey, 'Savory', savoryTurkey);
}

function roastChx() {
    question.innerHTML = 'What kind of wine would you like?';
    pair.drawButton('Sweet', sweetWhite, 'Light White', lightWhite, 'Rich White', richWhite);
}

function duck() {
    question.innerHTML = 'Is the dish...';
    pair.drawButton('Roasted', roastDuck, 'Spicy', spicyDuck, 'Savory', savoryDuck);
}

function roastDuck() {
    question.innerHTML = 'What kind of wine would you like?';
    pair.drawButton('Light Red', lightRed, 'Medium Red', mediumRed, 'Rich White', richWhite);
}

function spicyDuck() {
    question.innerHTML = 'What kind of wine would you like?';
    pair.drawButton('Light Red', lightRed, 'Medium Red', mediumRed, 'Sweet White', sweetWhite);
}

function savoryDuck() {
    question.innerHTML = 'What kind of wine would you like?';
    pair.drawButton('Fruity Red', bigFruitRed, 'Medium Red', mediumRed, 'Rich White', richWhite);
}

// ******* Veggie Main Dish *******
function veggie() {
    question.innerHTML = 'What style of vegetables are you enjoying?';
    pair.drawButton('Root Veggies', root, 'Green Veggies', green, 'Squash', squash);
}
function root() {
    question.innerHTML = 'What root vegetables are you enjoying?';
    pair.drawButton('Sweet (Yams/Carrots)', sweetRoot, 'Earthy (beets)', earthyRoot, 'Potato / Celeriac', starchRoot);
}
function green() {
    question.innerHTML = 'What kind of greens?';
    pair.drawButton('Salad Greens', salad, 'Braised Greens', braisedGreen, 'Roasted/Grilled Green', grillGreen);
}

function salad() {
    question.innerHTML = 'What kind of wine would you like?';
    pair.drawButton('Sparkling', sparkling, 'Light White', lightWhite, 'Sweet White', sweetWhite);
}

function braisedGreen() {
    question.innerHTML = 'What kind of wine would you like?';
    pair.drawButton('Rich White', richWhite, 'Light White', lightWhite, 'Light Red', lightRed);
}

function grillGreen() {
    question.innerHTML = 'What kind of wine would you like?';
    pair.drawButton('Rich White', richWhite, 'Light White', lightWhite, 'Sweet White', sweetWhite);
}

function squash() {
    question.innerHTML = 'What style of squash dish?';
    pair.drawButton('Sweeter', sweetSquash, 'Spicy', spicySquash, 'Savory', savorySquash);
}

function sweetSquash() {
    question.innerHTML = 'What kind of wine would you like?';
    pair.drawButton('Light White', lightWhite, 'Light Red', lightRed, 'Rich White', richWhite);
}

function spicySquash() {
    question.innerHTML = 'What kind of wine would you like?';
    pair.drawButton('Light White', lightWhite, 'Sweet White', sweetWhite, 'Rich White', richWhite);
}

function savorySquash() {
    question.innerHTML = 'What kind of wine would you like?';
    pair.drawButton('Light White', lightWhite, 'Light Red', lightRed, 'Rich White', richWhite);
}

function sweetRoot() {
    question.innerHTML = 'What kind of wine would you like?';
    pair.drawButton('Light White', lightWhite, 'Light Red', lightRed, 'Rich White', richWhite);
}
function earthyRoot() {
    question.innerHTML = 'What kind of wine would you like?';
    pair.drawButton('Light Red', lightRed, 'Medium Red', mediumRed, 'Rich White', richWhite);
}
function starchRoot() {
    question.innerHTML = 'What kind of wine would you like?';
    pair.drawButton('Light White', lightWhite, 'Sweet White', sweetWhite, 'Rich White', richWhite);
}

//************ Pasta *************
function pasta() {
    question.innerHTML = 'What style of pasta are you enjoying?';
    pair.drawButton('Red Sauce', redPasta, 'White Sauce', whitePasta, 'Something Else', otherPasta);
}
function redPasta() {
    question.innerHTML = 'What kind of wine would you like?';
    pair.drawButton('Light Red', lightRed, 'Sweet White', sweetWhite, 'Medium Red', mediumRed);
}

function whitePasta() {
    question.innerHTML = 'What kind of wine would you like?';
    pair.drawButton('Sparkling', sparkling, 'Light White', lightWhite, 'Rich White', richWhite);
}

function otherPasta() {
    question.innerHTML = 'What is your pasta like?';
    pair.drawButton('Garlic Based', garlicPasta, 'Oil Based', oilPasta, 'Herb Driven', herbPasta);
}

function garlicPasta() {
    question.innerHTML = 'What kind of wine would you like?';
    pair.drawButton('Sparkling', sparkling, 'Light White', lightWhite, 'Rich White', richWhite);
}

function oilPasta() {
    question.innerHTML = 'What kind of wine would you like?';
    pair.drawButton('Sparkling', sparkling, 'Light White', lightWhite, 'Light Red', lightRed);
}

function herbPasta() {
    question.innerHTML = 'What kind of wine would you like?';
    pair.drawButton('Sparkling', sparkling, 'Light White', lightWhite, 'Rich White', richWhite);
}

//************ Cheese *************

function cheese() {
    question.innerHTML = 'What style of cheese are you enjoying?';
    pair.drawButton('Creamy', creamyCheese, 'Hard', hardCheese, 'Blue', blueCheese);
}

function creamyCheese() {
    question.innerHTML = 'What kind of wine would you like?';
    pair.drawButton('Sparkling', sparkling, 'Dessert Wine', sweetDessert, 'Light White', lightWhite);
}

function hardCheese() {
    question.innerHTML = 'What kind of wine would you like?';
    pair.drawButton('Sparkling', sparkling, 'Dessert Wine', sweetDessert, 'Light Red', lightRed);
}
function blueCheese() {
    question.innerHTML = 'What kind of wine would you like?';
    pair.drawButton('Red Dessert Wine', redDessert, 'Medium Red', mediumRed, 'Sparkling', sparkling);
}

//********** Dessert ************
function dessert() {
    question.innerHTML = 'What kind of dessert?';
    pair.drawButton('Chocolate', chocolate, 'Fruit or Pastry', fruit, 'Cheese', cheese);
}

function chocolate() {
    question.innerHTML = 'What kind of wine would you like?';
    pair.drawButton('Dessert Wine', sweetDessert, 'Fruity Red', bigFruitRed, 'Dry Red', bigDryRed);
}

function fruit() {
    question.innerHTML = 'What kind of wine would you like?';
    pair.drawButton('Dessert Wine', sweetDessert, 'Sweet White', sweetWhite, 'Light White', lightWhite);
}


function foodPair() {
    question.innerHTML = 'What kind of food would you like to pair your wine with?';
    pair.drawButton('Appetizers', apps, 'Main Course', main, 'Desserts', dessert);
}
