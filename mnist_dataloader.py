import torch
from torchvision import datasets, transforms
from torch.utils.data import DataLoader

# Convert images into tensors
transform = transforms.ToTensor()

# Load MNIST training dataset
train_data = datasets.MNIST(
    root="data",
    train=True,
    download=True,
    transform=transform
)

# Load MNIST testing dataset
test_data = datasets.MNIST(
    root="data",
    train=False,
    download=True,
    transform=transform
)

# Create DataLoaders
train_loader = DataLoader(train_data, batch_size=64, shuffle=True)
test_loader = DataLoader(test_data, batch_size=64, shuffle=False)

print("Training samples:", len(train_data))
print("Testing samples:", len(test_data))

# Get one batch
images, labels = next(iter(train_loader))

print("Image batch shape:", images.shape)
print("Label batch shape:", labels.shape)