USE [DemoKDLv1]
GO

/****** Object:  Table [dbo].[mat_hang]    Script Date: 18/04/2025 7:14:37 CH ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[mat_hang](
	[mamh] [bigint] IDENTITY(1,1) NOT NULL,
	[gia] [bigint] NULL,
	[mota] [varchar](255) NULL,
	[size] [varchar](255) NULL,
	[thoigiannhaphang] [datetime2](6) NULL,
	[trongluong] [float] NULL,
PRIMARY KEY CLUSTERED 
(
	[mamh] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO


