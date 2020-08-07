
int removeElement0(int* nums, int numsSize, int val){
    for (int i = numsSize - 1; i >= 0; i--) {
        if (nums[i] == val) {
            for (int j = i; j < numsSize - 1; j++) {
                nums[j] = nums[j + 1];
            }
            nums[numsSize - 1] = val;
            numsSize--;
        }
    }
    return numsSize;
}

int removeElement1(int* nums, int numsSize, int val){
    
    int j = 0;
    for (int i = 0; i < numsSize; i++) {
        if (nums[i] != val) {
            nums[j] = nums[i];
            j++;
        }
    }
    return j;
}

int removeElement2(int* nums, int numsSize, int val){
    int i = 0;
    while (i < numsSize) {
        if (nums[i] == val) {
            nums[i] = nums[numsSize - 1];
            numsSize--;
        }
        else {
            i++;
        }
    }
    return numsSize;
}