

function lifePair() {
    question.innerHTML = 'Function Still in Progress';
    button1.innerHTML = 'Still';
    button2.innerHTML = 'Needs';
    button3.innerHTML = 'Building';
    button1.removeEventListener('click', foodPair);
    button2.removeEventListener('click', winePair);
    button3.removeEventListener('click', lifePair);
    button1.addEventListener('click', apps);
    button2.addEventListener('click', main);
    button3.addEventListener('click', dessert);
}