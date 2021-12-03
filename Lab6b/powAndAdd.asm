.globl powAndAdd

.text

powAndAdd:
	addi $t0, $0, 0 #i
	addi $t1, $0, 0 #sum
	
	loop:
	slt $t2, $t0, $a1
	beq $t2, $0, done
	sll $t2, $t0, 2
	add $t2, $t2, $a0
	lw $t3, 0($t2) #puts a[i] in t3
	addi $sp, $sp, -24 #make room
	sw $a2, 20($sp) 
	sw $ra, 16($sp)
	sw $t0, 12($sp)
	sw $t1, 8($sp)
	sw $a1, 4($sp)
	sw $a0, 0($sp)
	add $a0, $t3, $0
	add $a1, $a2, $0
	jal mathPow
	lw $a0, 0($sp)
	lw $a1, 4($sp)
	lw $t1, 8($sp)
	lw $t0, 12($sp)
	lw $ra, 16($sp)
	lw $a2, 20($sp)
	addi $sp, $sp, 24
	add $t1, $t1, $v0
	addi $t0, $t0, 1
	j loop
	
	done:
	add $v0, $0, $t1
	jr $ra
	
