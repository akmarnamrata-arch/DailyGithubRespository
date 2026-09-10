import torch

print("----- PYTORCH AUTOGRAD PRACTICAL -----")

# Step 1: Create tensors with requires_grad=True
x = torch.tensor(2.0, requires_grad=True)
y = torch.tensor(3.0, requires_grad=True)

print("x =", x)
print("y =", y)

# Step 2: Perform mathematical operation
z = x * y + x ** 2

print("z =", z)

# Step 3: Calculate gradients
z.backward()

# Step 4: Display gradients
print("\nGradient of x:", x.grad)
print("Gradient of y:", y.grad)