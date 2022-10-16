import numpy as np
M = np.array([[2,3,4], [3,45,8], [4,8,78]])
print("---Matrix A---\n", M)
ai = np.linalg.inv(M) 
print('\n\nInverse of A as ----\n', ai)
