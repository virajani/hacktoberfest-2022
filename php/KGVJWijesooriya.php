<?php 

function removeDuplicateEl($array){
    return array_unique($array, SORT_REGULAR);
}

print_r(removeDuplicateEl([1,4,5,4,2,5,7,3]));

function findLargestNum($array){
    return print_r(max($array));
}

findLargestNum([54,23,65,76,12,4]);

?>
