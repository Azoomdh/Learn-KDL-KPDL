USE [DemoKDLv1]
GO

/****** Object:  Table [dbo].[khach_hang]    Script Date: 18/04/2025 7:14:16 CH ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[khach_hang](
	[makh] [bigint] IDENTITY(1,1) NOT NULL,
	[ngaydathangdautien] [datetime2](6) NULL,
	[tenkh] [varchar](255) NULL,
	[matp] [bigint] NULL,
PRIMARY KEY CLUSTERED 
(
	[makh] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO

ALTER TABLE [dbo].[khach_hang]  WITH CHECK ADD  CONSTRAINT [FKapf1elean7ysac9on42beh8su] FOREIGN KEY([matp])
REFERENCES [dbo].[van_phong_dai_dien] ([matp])
GO

ALTER TABLE [dbo].[khach_hang] CHECK CONSTRAINT [FKapf1elean7ysac9on42beh8su]
GO


