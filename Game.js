function generateBoard() {
  let length = 3;
  let width = 3;

  let board = [
    { row: 0, col: 0, value: "X" },
    { row: 0, col: 1, value: "X" },
    { row: 0, col: 2, value: "O" },
    { row: 1, col: 0, value: "O" },
    { row: 1, col: 1, value: " " },
    { row: 1, col: 2, value: "X" },
    { row: 2, col: 0, value: "X" },
    { row: 2, col: 1, value: "O" },
    { row: 2, col: 2, value: "O" },
  ];
  return board;
}

let mainBoard = new Array(3);

let index = 0;
const board = generateBoard();
for (let count = 0; count < mainBoard.length; count++) {
  let innerBoard = new Array(3);
  for (let counter = 0; counter < innerBoard.length; counter++) {
    let numb = board[index++].value;
    innerBoard[counter] = numb;
  }
  mainBoard[count] = innerBoard;
}
console.log(mainBoard);
