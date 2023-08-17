function resetGame() {
  playerActive = 0;
  currentRound = 1;
  gamePlay = false;

  let gameBlockIndex = 0;
  for (i = 0; i <= 2; i++) {
    for (j = 0; j <= 2; j++) {
      gameTracking[i][j] = 0;
      const gameBlockIndexElement = gameField.children[gameBlockIndex];
      gameBlockIndexElement.textContent = "";
      gameBlockIndexElement.classList.remove("disabled");
      gameBlockIndex++;
    }
  }

  gameStatus.style.display = "none";
  winnerName.innerHTML = '<span id="winner-name">Player Name</span> Wins!!';
}

function startGame() {
  if (players[0].name == "" || players[1].name == "") {
    startGameButton.parentElement.previousElementSibling.children[1].style.display =
      "flex";
    return;
  }
  resetGame();
  startGameButton.parentElement.previousElementSibling.children[1].style.display =
    "none";
  gameFieldArea.style.display = "block";

  playersTurnElement.textContent = players[playerActive].name + "'s";
}

function switchPlayer() {
  if (playerActive == 0) {
    playerActive = 1;
  } else {
    playerActive = 0;
  }
  playersTurnElement.textContent = players[playerActive].name + "'s";
}

function gameBegin(event) {
  const selectedRow = event.target.dataset.row - 1;
  const selectedColumn = event.target.dataset.col - 1;

  // if gamePlay is true which it is cause endGame() was triggered so the game will stop
  if (gamePlay) {
    return;
  }
  
  // if the block is already clicked it will have a value in game tracking array and hence will ask to select new unselected block
  if (gameTracking[selectedRow][selectedColumn] > 0) {
    errorPara2.style.display = "flex";
    return;
  }

  errorPara2.style.display = "none";
  event.target.textContent = players[playerActive].symbol;
  event.target.classList.add("disabled");

  gameTracking[selectedRow][selectedColumn] = playerActive + 1;
  // will tell us which player clicked it 1 0r 2

  const winnerId = checkForWin();
  console.log(winnerId);

  if (winnerId !== 0) {
    return endGame(winnerId);
  }

  currentRound++;

  switchPlayer();
}

function checkForWin() {
  // for loop for all rows
  for (let i = 0; i <= 2; i++)
    if (
      gameTracking[i][0] > 0 &&
      gameTracking[i][0] === gameTracking[i][1] &&
      gameTracking[i][0] === gameTracking[i][2]
    ) {
      return gameTracking[i][0];
    }

  // for loop for all columns
  for (let i = 0; i <= 2; i++)
    if (
      gameTracking[0][i] > 0 &&
      gameTracking[0][i] === gameTracking[1][i] &&
      gameTracking[0][i] === gameTracking[2][i]
    ) {
      return gameTracking[0][i];
    }

  // for diagonals (left top to right bottom)
  if (
    gameTracking[0][0] > 0 &&
    gameTracking[0][0] === gameTracking[1][1] &&
    gameTracking[0][0] === gameTracking[2][2]
  ) {
    return gameTracking[0][0];
  }

  // for diagonals (left bottom to right top)
  if (
    gameTracking[2][0] > 0 &&
    gameTracking[2][0] === gameTracking[1][1] &&
    gameTracking[2][0] === gameTracking[0][2]
  ) {
    return gameTracking[2][0];
  }

  if (currentRound === 9) {
    return -1;
  }

  return 0;
}

function endGame(winnerId) {
  gamePlay = true;
  if (winnerId > 0) {
    gameStatus.style.display = "block";
    winnerName.textContent = players[winnerId - 1].name;
  } else {
    gameStatus.style.display = "block";
    headingFour.textContent = "it's a draw!!";
  }
}
