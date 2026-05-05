USE [DemoKDLv1]
GO

/****** Object:  Table [dbo].[cua_hang]    Script Date: 18/04/2025 7:12:24 CH ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[cua_hang](
	[mach] [bigint] IDENTITY(1,1) NOT NULL,
	[sodt] [varchar](255) NULL,
	[thoigianmoban] [datetime2](6) NULL,
	[matp] [bigint] NULL,
PRIMARY KEY CLUSTERED 
(
	[mach] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO

ALTER TABLE [dbo].[cua_hang]  WITH CHECK ADD  CONSTRAINT [FK38ypdeyktspcwjb4cmy81pg19] FOREIGN KEY([matp])
REFERENCES [dbo].[van_phong_dai_dien] ([matp])
GO

ALTER TABLE [dbo].[cua_hang] CHECK CONSTRAINT [FK38ypdeyktspcwjb4cmy81pg19]
GO


