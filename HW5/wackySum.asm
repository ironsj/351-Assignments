.globl wackySum combineFour

.text

wackySum:
	add $t0, $a0, $0 #i = a
	addi $t1, $0, 0 #sum = 0
	
	for:
		slt $t2, $a1, $t0 #i <= b
		beq $t2, 1, done #if i > b break from loop
		addi $sp, $sp, -28 #make room
		sw $t1, 24($sp)
		sw $t0, 20($sp)
		sw $a3, 16($sp)
		sw $a2, 12($sp) #store $a2
		sw $a1, 8($sp) #store $a1
		sw $a0, 4($sp) #store $a0
		sw $ra, 0($sp) #store $ra
		add $a0, $t0, $0 #first parameter for combineFour
		addi $a1, $t0, 1
		srl $a1, $a1, 1 #second parameter for combineFour
		addi $a2, $t0, 2
		srl $a2, $a2, 1 #third parameter for combineFour
		addi $a3, $t0, 3 #fourth parameter for combineFour
		jal combineFour
		lw $ra, 0($sp)
		lw $a0, 4($sp)
		lw $a1, 8($sp)
		lw $a2, 12($sp)
		lw $a3, 16($sp)
		lw $t0, 20($sp)
		lw $t1, 24($sp)
		addi $sp, $sp, 28 #restore space
		add $t1, $t1, $v0 #add result of combineFour to sum
		add $t0, $t0, $a2 #increment i by c
		j for
	done:
		add $v0, $t1, $0 #add sum to $v0
		jr $ra
	
combineFour:
	add $t0, $a0, $a1 #first + second
	add $t1, $a2, $a3 #third + fourth
	add $t2, $t0, $t1 #sum of sums
	andi $t0, $t2, 1 #gets the lsb of the sum (checks if even)
	bne $t0, 0, else #if lsb is 1 (odd), break
	add $v0, $0, $t2 #store sum in $v0
	jr $ra
	else:
		srl $t2, $t2, 1 #divide sum by 2
		add $v0, $0, $t2 #store sum/2 in $v0
		jr $ra
		
	
	
	
	