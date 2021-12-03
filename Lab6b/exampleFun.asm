.globl exampleFun



# $sp before entering the function is 0xFFFF00FC



exampleFun:

    addi $s0, $0, 7

    addi $s1, $0, 9

    jal otherFun

    addi $s0, $v0, 7  # <-- address of this line is 0x01001234

    ... # rest of exampleFun

    jr $ra



otherFun:

    addi $sp, $sp, -20

    sw $a0, 0($sp)

    sw $a1, 4($sp)

    sw $a2, 8($sp)

    sw $ra, 12($sp)

    sw $s0, 16($sp)

    addi $s0, $s0, 14

    # <-- give the contents of the stack here

    ... # rest of otherFun

    jr $ra