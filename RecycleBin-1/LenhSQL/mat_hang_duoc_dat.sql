USE [DemoKDLv1]
GO

/****** Object:  Table [dbo].[mat_hang_duoc_dat]    Script Date: 18/04/2025 7:14:53 CH ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[mat_hang_duoc_dat](
	[giadat] [bigint] NULL,
	[soluongdat] [int] NULL,
	[madon] [bigint] NOT NULL,
	[mamh] [bigint] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[madon] ASC,
	[mamh] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO

ALTER TABLE [dbo].[mat_hang_duoc_dat]  WITH CHECK ADD  CONSTRAINT [FK1fhxkx0mm215b3cxp50fhshlp] FOREIGN KEY([madon])
REFERENCES [dbo].[don_dat_hang] ([madon])
GO

ALTER TABLE [dbo].[mat_hang_duoc_dat] CHECK CONSTRAINT [FK1fhxkx0mm215b3cxp50fhshlp]
GO

ALTER TABLE [dbo].[mat_hang_duoc_dat]  WITH CHECK ADD  CONSTRAINT [FKa7jaiap0cy55s4ju9ab0xb70h] FOREIGN KEY([mamh])
REFERENCES [dbo].[mat_hang] ([mamh])
GO

ALTER TABLE [dbo].[mat_hang_duoc_dat] CHECK CONSTRAINT [FKa7jaiap0cy55s4ju9ab0xb70h]
GO


