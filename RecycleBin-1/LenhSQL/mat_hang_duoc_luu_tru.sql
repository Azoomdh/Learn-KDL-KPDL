USE [DemoKDLv1]
GO

/****** Object:  Table [dbo].[mat_hang_duoc_luu_tru]    Script Date: 18/04/2025 7:17:10 CH ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[mat_hang_duoc_luu_tru](
	[soluongtrongkho] [int] NULL,
	[thoigianluutru] [datetime2](6) NULL,
	[mach] [bigint] NOT NULL,
	[mamh] [bigint] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[mach] ASC,
	[mamh] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO

ALTER TABLE [dbo].[mat_hang_duoc_luu_tru]  WITH CHECK ADD  CONSTRAINT [FKi3qrhnfdqpookh5ygpejqvnj3] FOREIGN KEY([mach])
REFERENCES [dbo].[cua_hang] ([mach])
GO

ALTER TABLE [dbo].[mat_hang_duoc_luu_tru] CHECK CONSTRAINT [FKi3qrhnfdqpookh5ygpejqvnj3]
GO

ALTER TABLE [dbo].[mat_hang_duoc_luu_tru]  WITH CHECK ADD  CONSTRAINT [FKqdjpuf03r2j0rd166u95ma7si] FOREIGN KEY([mamh])
REFERENCES [dbo].[mat_hang] ([mamh])
GO

ALTER TABLE [dbo].[mat_hang_duoc_luu_tru] CHECK CONSTRAINT [FKqdjpuf03r2j0rd166u95ma7si]
GO


