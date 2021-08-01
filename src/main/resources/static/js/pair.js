class PairingManager {
    constructor() {
        this.button1 = 'Pair with Food'
        this.button2 = 'Pair with Wine'
        this.button3 = 'Pair with Life'
        this.event1 = foodPair
        this.event2 = winePair
        this.event3 = lifePair
        this.buttonShow = 3
    }
    drawButton(html1, newEvent1, html2, newEvent2, html3, newEvent3) {
        this.button1 = html1
        this.button2 = html2
        this.button3 = html3
        button1.innerHTML = this.button1
        button2.innerHTML = this.button2
        button3.innerHTML = this.button3
        button1.removeEventListener('click', this.event1);
        button2.removeEventListener('click', this.event2);
        button3.removeEventListener('click', this.event3);
        button1.addEventListener('click', newEvent1);
        button2.addEventListener('click', newEvent2);
        button3.addEventListener('click', newEvent3);
        this.event1 = newEvent1
        this.event2 = newEvent2
        this.event3 = newEvent3
    }
    reset() {
        this.drawButton('Pair wine with food', foodPair, 'Pair food with wine', winePair, 'Pair wine with Life', lifePair)
        question.innerHTML = 'What would you like to pair?'
    }
}
