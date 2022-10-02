<?php 

function removeDuplicates($array){
    return array_unique($array, SORT_REGULAR);
}

print_r(removeDuplicates([1,4,5,4,2,5,7,3]));

?>