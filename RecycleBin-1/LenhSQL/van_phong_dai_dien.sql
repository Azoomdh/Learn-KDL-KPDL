USE [DemoKDLv1]
GO

/****** Object:  Table [dbo].[van_phong_dai_dien]    Script Date: 18/04/2025 7:17:37 CH ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[van_phong_dai_dien](
	[matp] [bigint] IDENTITY(1,1) NOT NULL,
	[bang] [varchar](255) NULL,
	[diachivanphong] [varchar](255) NULL,
	[tentp] [varchar](255) NULL,
	[thoigianlapvanphong] [datetime2](6) NULL,
PRIMARY KEY CLUSTERED 
(
	[matp] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO


