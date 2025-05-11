#  Branch Protection Rules #

## Why These Rules Matter

Branch protection helps maintain code quality and team collaboration. In this project, we enabled protection for the `main` branch to prevent accidental changes and enforce good coding practices.

###  Rules Enabled

- **Pull request required**: All changes must go through a PR and be reviewed by at least one team member. This helps catch bugs and ensures team collaboration.
- **Status checks required**: The CI pipeline (GitHub Actions) must pass all tests before code is merged. This keeps the project stable.
- **No direct pushes**: Prevents contributors from pushing unreviewed or untested code directly to `main`.

These settings help ensure that only tested, reviewed, and approved code is included in the final product.

## Benefits
- Improves **code quality**
- Reduces **bugs**
- Encourages **team review**
- Ensures **stable releases**
