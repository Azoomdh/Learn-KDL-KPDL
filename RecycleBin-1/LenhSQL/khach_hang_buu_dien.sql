USE [DemoKDLv1]
GO

/****** Object:  Table [dbo].[khach_hang_buu_dien]    Script Date: 18/04/2025 7:14:22 CH ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[khach_hang_buu_dien](
	[diachibuudien] [varchar](255) NULL,
	[makh] [bigint] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[makh] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO

ALTER TABLE [dbo].[khach_hang_buu_dien]  WITH CHECK ADD  CONSTRAINT [FKtkd1sv2udrsdllrmjxa27suwb] FOREIGN KEY([makh])
REFERENCES [dbo].[khach_hang] ([makh])
GO

ALTER TABLE [dbo].[khach_hang_buu_dien] CHECK CONSTRAINT [FKtkd1sv2udrsdllrmjxa27suwb]
GO


