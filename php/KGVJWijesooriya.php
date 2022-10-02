<?php 

function removeDuplicateEl($array){
    return array_unique($array, SORT_REGULAR);
}

print_r(removeDuplicateEl([1,4,5,4,2,5,7,3]));
?>