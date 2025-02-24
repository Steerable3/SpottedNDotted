-- Leader key
vim.g.mapleader = " "

-- Import
require("config.lazy")

-- Numbering
vim.opt.number = true
vim.opt.relativenumber = true

-- My key mappings
vim.keymap.set("n", "<leader>e", vim.cmd.Ex)
