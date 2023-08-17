function openPlayerConfig(event) {
    // function to capture which playerid was clicked
    playerId = +event.target.dataset.playerid;

    backDropElement.style.display = 'block';
    playerConfigElement.style.display = 'block';
    startGameButton.parentElement.previousElementSibling.children[1].style.display = 'none';
}

function closePlayerConfig() {
    backDropElement.style.display = 'none';
    playerConfigElement.style.display = 'none';

    errorPara.style.display = "none";
    inputElement.value = '';
    inputElement.style.borderColor = "var(--dark-purple)";
    headingTwo.style.color = "var(--dark-purple)";
    confirmButtonConfig.style.backgroundColor = "var(--dark-purple)";
    inputElement.previousElementSibling.style.color= "var(--dark-purple)";
}

function executeOnlyWhenFocusedOnInputElement() {
    errorPara.style.display = "none";
    inputElement.value = '';
    inputElement.style.borderColor = "var(--dark-purple)";
    headingTwo.style.color = "var(--dark-purple)";
    confirmButtonConfig.style.backgroundColor = "var(--dark-purple)";
    inputElement.previousElementSibling.style.color= "var(--dark-purple)";
}



function savePlayerConfig(event) {
    event.preventDefault();
    const formData = new FormData(event.target);
    const enteredValue = formData.get('player-name').trim();
    
    if (!inputElement.value) {
        errorPara.classList = "error";
        errorPara.style.display = "flex";
        inputElement.style.borderColor = "var(--error-red)";
        headingTwo.style.color = "var(--error-red)";
        confirmButtonConfig.style.backgroundColor = "var(--error-red)";
        inputElement.previousElementSibling.style.color= "var(--error-red)";

        return;
    }

    const namePlaceInConfig = document.getElementById('name-space-'+playerId);
    namePlaceInConfig.textContent = enteredValue;


    
    players[playerId - 1].name= enteredValue;
    
    // alternative to above statement
    // if (playerId == 1) {
    //     players[0].name = enteredValue;
    // } else {
    //     players[1].name = enteredValue;
    // }
    
    closePlayerConfig();
}