/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var moveZeroes = function(nums) {
    var i=0;
    var j=0;
    while (j<nums.length) {
        if(nums[j]!==0) {
            if(j === i) {
                i++;
            }else {
                nums[i++] = nums[j];
                nums[j] = 0;
            }
            j++;
        }else {
            j++;
        }
    }
};
