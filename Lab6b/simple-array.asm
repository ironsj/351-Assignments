.globl addArray

.text

addArray:
	addi $t0, $0, 0
	addi $t1, $0, 0
	
	addLoop:
	slt $t2, $t0, $a1
	beq $t2, $0, done
	sll $t2, $t0, 2
	add $t2, $t2, $a0
	lw $t3, 0($t2) #puts a[i] in t3
	add $t1, $t1, $t3
	addi $t0, $t0, 1
	j addLoop
	
	
	done:
	add $v0, $0, $t1
	jr $ra