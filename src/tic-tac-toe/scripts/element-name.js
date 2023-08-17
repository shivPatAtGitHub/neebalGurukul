const backDropElement = document.getElementById('modal-overlay');
const playerConfigElement = document.getElementById('player-config');

const inputElement = document.getElementById('edit-player-name');
const formElement = document.querySelector('form');

const editButtonElementP1 = document.querySelector('.edbn-one');
const editButtonElementP2 = document.querySelector('.edbn-two');

const cancelButtonConfig = document.getElementById('config-cancel-button');
const confirmButtonConfig = document.getElementById('config-confirm-button');

let playerId = 0;

const players = [
    {
        name: "",
        symbol: "x"
    },
    {
        name: "",
        symbol: "o"
    }
];

const colors = ['red', 'green', 'blue', 'teal', 'pink', 'yellow', 'orange'];

const gameTracking = [
    [0, 0, 0],
    [0, 0, 0],
    [0, 0, 0]
];

let gamePlay = false;

const errorPara = document.getElementById('error-msg');
const errorPara2 = document.getElementById('error-msg2');

const headingTwo = document.querySelector('h2');
const headingFour = document.querySelector('h4');
const headingFive = document.querySelector('h5');
const winnerName = document.getElementById('winner-name');

const startGameButton = document.getElementById('start-game-btn');
const gameStatus = document.getElementById('game-status');
const gameFieldArea = document.getElementById('actual-game');


const playersTurnElement = document.getElementById('player-name-turn-span');
const gameField = document.getElementById('actual-game-ol');
const gameFieldBlocks = document.querySelectorAll('#actual-game-ol li');

let playerActive = 0;
let currentRound = 1;

for (const gameFieldBlock of gameFieldBlocks) {
    gameFieldBlock.addEventListener('click', gameBegin);
}


// All-Event-Listeners


editButtonElementP1.addEventListener('click', openPlayerConfig);
editButtonElementP2.addEventListener('click', openPlayerConfig);

cancelButtonConfig.addEventListener('click', closePlayerConfig);
backDropElement.addEventListener('click', closePlayerConfig);

formElement.addEventListener('submit', savePlayerConfig);
confirmButtonConfig.addEventListener('submit', savePlayerConfig);
inputElement.addEventListener('focus', executeOnlyWhenFocusedOnInputElement);

startGameButton.addEventListener('click', startGame);

