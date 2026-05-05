USE [DemoKDLv1]
GO

/****** Object:  Table [dbo].[don_dat_hang]    Script Date: 18/04/2025 7:13:32 CH ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[don_dat_hang](
	[madon] [bigint] IDENTITY(1,1) NOT NULL,
	[ngaydathang] [datetime2](6) NULL,
	[makh] [bigint] NULL,
PRIMARY KEY CLUSTERED 
(
	[madon] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO

ALTER TABLE [dbo].[don_dat_hang]  WITH CHECK ADD  CONSTRAINT [FK7f7o8batqftxfciqjvmqj50ep] FOREIGN KEY([makh])
REFERENCES [dbo].[khach_hang] ([makh])
GO

ALTER TABLE [dbo].[don_dat_hang] CHECK CONSTRAINT [FK7f7o8batqftxfciqjvmqj50ep]
GO


