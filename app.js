/**
 * @param {number[]} flowerbed
 * @param {number} n
 * @return {boolean}
 */
var canPlaceFlowers = function (flowerbed, n) {
  var count0 = 0;
  var count1 = 0;
  for (var i = 0; i < flowerbed.length; i++) {
    if (flowerbed[i] === 0) {
      count0++;
    } else if (flowerbed[i] === 1) {
      count1++
    }
  }

  
  let differance = count0-n
  if(isOdd(differance)){
    return true;
  }else {
    return false;
  }
}

let isOdd = function(number) {
  return number%2 !== 0;
}
let result = canPlaceFlowers([1,0,0,0,1],2)

console.log(result)

