#Jacob Lockwood & Jacob Irons
.globl makes10 dateFashion

.text

makes10:
	addi $t0, $0, 10
	add $t1, $a0 $a1
	bne $t1, $t0, makes10a
	addi $v0, $0, 1
	j, makes10Final
	
	makes10a:
	bne $a0, $t0, makes10b
	addi $v0, $0, 1
	j, makes10Final
	
	makes10b:
	bne $a1, $t0, makes10else
	addi $v0, $0, 1
	j, makes10Final
	
	makes10else:
	addi $v0, $0, 0
	
	makes10Final:
	jr $ra
	

dateFashion:
	slti $t0, $a0, 3
	slti $t1, $a1, 3
	or $t3, $t0, $t1
	beq $t3, $0, datefashionelseif
	addi $v0, $0, 0
	j datefashionfinal
	
	
	datefashionelseif:
	slti $t4, $a0, 8
	slti $t5, $a1, 8
	and $t6, $t4, $t5
	addi $t7, $0, 1
	beq $t6, $t7, datefashionelse
	addi $v0, $0, 2
	j datefashionfinal
	
	datefashionelse:
	addi $v0, $0, 1
	
	datefashionfinal:
	jr $ra
	
