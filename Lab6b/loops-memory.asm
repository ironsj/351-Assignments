#Jacob Lockwood & Jacob Irons
.globl max sum67

.text

max:
	addi $t0, $0, 0 #i = 0
	sll $t2, $t0, 2 
	add $t2, $t2, $a0
	lw $t7, 0($t2) #puts first value in array in t7 as max
	
	maxloop:
	slt $t2, $t0, $a1 
	beq $t2, $0, maxdone
	sll $t2, $t0, 2
	add $t2, $t2, $a0
	lw $t3, 0($t2) #puts a[i] in t3
	slt $t4, $t3, $t7 #compares a[i] and max value and puts in t4
	beq $t4, $0, newmax #breaks if a[i] greater than max
	addi $t0, $t0, 1
	j maxloop
	
	newmax:
	add $t7, $0, $t3 #puts new max in t7
	addi $t0, $t0, 1
	j maxloop
	
	
	maxdone:
	add $v0, $0, $t7
	jr $ra
	
sum67:
	addi $t0, $0, 0 #i = 0
	addi $t1, $0, 0 #t1 is 0 if can add to sum, 1 if it cannot add
	addi $t7, $0, 0 #t7 is the sum
	
	
	sumloop:
	slt $t2, $t0, $a1
	beq $t2, $0, sumdone
	sll $t2, $t0, 2
	add $t2, $t2, $a0
	lw $t3, 0($t2) #puts a[i] in t3
	beq $t1, 1, stuck #breaks if the sum can't be added to
	beq $t3, 6, stop #breaks if a[i] is 6
	add $t7, $t7, $t3 #adds a[i] to the sum
	add $t0, $t0, 1
	j sumloop
	
	stuck:
	beq $t3, 7, start #breaks if a[i] is 7, and we can start adding again
	add $t0, $t0, 1
	j sumloop
	
	start:
	addi $t1, $0, 0 #makes it so t1 is 0 and we can start adding again
	add $t0, $t0, 1
	j sumloop
	
	stop:
	addi $t1,$0, 1 #makes t1 equal to 1 so we can not add to the sum
	addi $t0, $t0, 1
	j sumloop
		 	
	sumdone:
	add $v0, $0, $t7
	jr $ra
	
	
	
	
	
	
	
