const button1 = document.getElementById('button1')
const button2 = document.getElementById('button2')
const button3 = document.getElementById('button3')
const resetButton = document.getElementById('reset')
const question = document.getElementById('question')

const pair = new PairingManager



button1.addEventListener('click', foodPair)
button2.addEventListener('click', winePair)
button3.addEventListener('click', lifePair)
resetButton.addEventListener('click', pair.reset())