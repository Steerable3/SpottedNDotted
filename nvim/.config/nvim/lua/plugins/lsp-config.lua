return {
	{
		"williamboman/mason.nvim",
		config = function()
			require("mason").setup()
		end,
	},
	{
		"williamboman/mason-lspconfig.nvim",
		config = function()
			require("mason-lspconfig").setup({
				ensure_installed = { "lua_ls", "jdtls" },
			})
		end,
	},
	{
		"neovim/nvim-lspconfig",
		config = function()
			local capabilities = require("cmp_nvim_lsp").default_capabilities()
			local lspconfig = require("lspconfig")
			-- Lua landuage server
			lspconfig.lua_ls.setup({
				capabilities = capabilities,
			})
			-- Java landuage server
			lspconfig.jdtls.setup({
				capabilities = capabilities,
			})
			-- Nix landuage server
			lspconfig.nixd.setup({
				capabilities = capabilities,
			})


			vim.keymap.set("n", "K", vim.lsp.buf.hover, {})
			vim.keymap.set("n", "gd", vim.lsp.buf.definition, {})
			vim.keymap.set( "n" , "<leader>ca", vim.lsp.buf.code_action, {})
		end,
	},
}
