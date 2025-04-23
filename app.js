/**
 * @param {number[]} flowerbed
 * @param {number} n
 * @return {boolean}
 */
function canPlaceFlowers(flowerbed, n) {
    if (n === 0) return true;
  
    for (let i = 0; i < flowerbed.length; i++) {
      if (
        flowerbed[i] === 0 &&
        (i === 0 || flowerbed[i - 1] === 0) &&
        (i === flowerbed.length - 1 || flowerbed[i + 1] === 0)
      ) {
        console.log(flowerbed[i],flowerbed[i-1])
        flowerbed[i] = 1;
        n--;
        if (n === 0) return true;
      }
    }
  
    return false;
  }
  
  // Example usage:
  console.log(canPlaceFlowers([1, 0, 0, 0, 1], 1)); // true
  console.log(canPlaceFlowers([1, 0, 0, 0, 1], 2)); // false
  