# mtd2026
learning..
# Git Notes

## Git and GitHub Basics

- **GitHub** is a cloud platform used to host Git repositories.
- **Git** is a **CLI (Command Line Interface)** tool used to track version control. (GUI tools also exist, but Git itself is commonly used through the command line.)

## Useful Command

### Open the Current Working Directory (CWD) in VS Code

```bash
code .
```

`code .` opens the **current working directory (CWD)** in Visual Studio Code.

## Repository Example

```
neelmyna/mtd2026_batch1
```

## Git Workflow

### Stage Files

```bash
git add .
```

Stages the files that you want Git to track for the next commit.

### Commit Changes

```bash
git commit -m "Your commit message"
```

Creates a commit and saves your staged changes with a message describing what was changed.

### Push Changes

```bash
git push
```

Uploads your committed changes to the remote GitHub repository.

---

## Git Credentials

After configuring Git, you can check your saved credentials:

1. Open **Windows Credential Manager**.
2. Go to **Windows Credentials**.
3. Search for Git or GitHub credentials if needed.

---

# Cloning a Repository Using a Personal Access Token (PAT)

Example:

```bash
git clone https://<PAT>@github.com/AnuragHemanth/mtd2026.git
```

Replace `<PAT>` with your Personal Access Token.

**Note:**
- The `@` symbol comes **after** the PAT and **before** `github.com`.
- Do **not** share or commit your Personal Access Token. It gives access to your GitHub account based on its permissions.
- Avoid storing PATs in notes or code. Use Git Credential Manager or SSH keys when possible.

Example format:

```text
https://<PAT>@github.com/username/repository.git
```
