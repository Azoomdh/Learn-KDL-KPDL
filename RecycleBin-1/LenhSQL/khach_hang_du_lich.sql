USE [DemoKDLv1]
GO

/****** Object:  Table [dbo].[khach_hang_du_lich]    Script Date: 18/04/2025 7:14:31 CH ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[khach_hang_du_lich](
	[huongdanviendulich] [varchar](255) NULL,
	[makh] [bigint] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[makh] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO

ALTER TABLE [dbo].[khach_hang_du_lich]  WITH CHECK ADD  CONSTRAINT [FKapthsa0l4j3nfubbh8lmgmcpj] FOREIGN KEY([makh])
REFERENCES [dbo].[khach_hang] ([makh])
GO

ALTER TABLE [dbo].[khach_hang_du_lich] CHECK CONSTRAINT [FKapthsa0l4j3nfubbh8lmgmcpj]
GO


