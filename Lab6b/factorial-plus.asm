.globl factorialPlus

.text

factorialPlus:
	addi $sp, $sp, -12 #make room 
	sw $ra, 8($sp)
	sw $t0, 4($sp)
	sw $a0, 0($sp)
	jal factorial
	lw $a0, 0($sp)
	lw $t0, 4($sp) #load $a1
	lw $ra, 8($sp) #load $a0
	addi $sp, $sp, 12
	add $v0, $v0, $a0
	jr $ra