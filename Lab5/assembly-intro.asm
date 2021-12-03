#Jacob Lockwood & Jacob Irons
.globl monkeyTrouble sleepIn posNeg

.text 


monkeyTrouble:
	and $t0, $a0, $a1
	not $a0, $a0
	andi $a0, $a0, 1
	not $a1, $a1
	andi $a1, $a1, 1
	and $t1, $a0, $a1
	or $v0, $t0, $t1
	jr $ra	
	
sleepIn:
	not $a0, $a0
	andi $a0, $a0, 1
	or $v0, $a0, $a1
	jr $ra

posNeg:
	slti $t0, $a0, 0
	slti $t1, $a1, 0
	and $t2, $t0, $t1
	and $t3, $t2, $a2 
	
	xor $t4, $t0, $t1
	not $a2, $a2
	andi $a2, $a2, 1
	and $t5, $t4, $a2
	
	or $v0, $t3, $t5
	jr $ra
	
