

function winePair() {
    question.innerHTML = 'What kind of wine are you enjoying?';
    pair.drawButton('White', white, 'Red', red, 'Sparkling', sparkling)
}
function red() {
    question.innerHTML = 'What kind of red wine are you enjoying?';
    pair.drawButton('Big and Bold', white, 'Medium Bodied', red, 'Light and Elegant', sparkling)
}
function white() {
    question.innerHTML = 'What kind of white wine are you enjoying?';
    pair.drawButton('Oakey or Buttery', white, 'Bright and Refreshing', red, 'Floral or Sweet', sparkling)
}
function sparkling() {
    question.innerHTML = 'Will you just drink the bubbles now?';
    pair.drawButton('Yes', white, 'Bubbles are Life', red, 'Is there More?', sparkling)
}