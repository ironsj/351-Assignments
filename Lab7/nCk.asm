#Jacob Lockwood & Jacob Irons
.globl nCk

.text

nCk:
	slti $t0, $a0, 0 
	beq $t0, 1, error #error if n < 0
	slti $t0, $a1, 0
	beq $t0, 1, error #error if k < 0
	slt $t0, $a0, $a1
	beq $t0, 1, error #error if k > n
	addi $sp, $sp, -16 #make room 
	sw $a1, 12($sp) #store $a1
	sw $a0, 8($sp) #store $a0
	sw $ra, 4($sp) #store $ra
	add $t0, $0, $0 #$t0 = 0
	add $t1, $0, $a1 #$t1 = $a1
	bne $a1, $t0, elseif #k = 0?
	addi $v0, $0, 1 #return 1
	addi $sp, $sp, 16 #restore $sp
	jr $ra
	
	elseif:
	bne $a0, $a1, else #n=k?
	addi $v0, $0, 1 #return 1
	addi $sp, $sp, 16 #restore $sp
	jr $ra
	
	else:
	addi $a0, $a0, -1
	jal nCk
	add $s0, $0, $v0
	sw $s0, 0($sp)
	lw $ra, 4($sp) #load $a1
	lw $a0, 8($sp) #load $a0
	lw $a1, 12($sp) #load $ra
	addi $a0, $a0, -1
	addi $a1, $a1, -1
	jal nCk
	lw $s0, 0($sp)
	lw $ra, 4($sp) #load $a1
	lw $a0, 8($sp) #load $a0
	lw $a1, 12($sp) #load $ra
	addi $sp, $sp, 16 #restore room
	add $v0, $v0, $s0
	jr $ra 
	
	error:
	addi $v0, $0, -1
	jr $ra
	
